import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from '../../environments/environment.development';
import { iFilms } from '../Models/i-films';
import { BehaviorSubject, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FilmService {

  constructor(private http:HttpClient) {
   }

  apiUrl:string = environment.moviesUrl

  films:iFilms[] = []

  filmSubject = new BehaviorSubject<iFilms[]>([]);

  film$ = this.filmSubject.asObservable()


  getAll(): Observable<iFilms[]>{
    return this.http.get<iFilms[]>(this.apiUrl)
  }




}
