import { Component } from '@angular/core';
import { iPhone } from '../../models/i-phone';
import { ProductsService } from '../../products.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {
  products:iPhone[] = []

  constructor(private productsSvc:ProductsService){}

  ngOnInit(){
    this.productsSvc.getAll().subscribe(res => {
      this.products = res.products})
  }
}

