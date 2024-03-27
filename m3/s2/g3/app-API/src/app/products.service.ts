import { iPhone } from './models/i-phone';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { iProduct } from './models/i-product';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {

  apiUrl:string = "https://dummyjson.com/products"

  constructor(private http:HttpClient) {}

  getAll(){
    return this.http.get<iProduct>(this.apiUrl)
  }
}
