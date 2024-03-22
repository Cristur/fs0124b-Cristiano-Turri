import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { iCar } from '../../car';
import { CarService } from '../../car.service';

@Component({
  selector: 'app-dettagli-macchina',
  templateUrl: './dettagli-macchina.component.html',
  styleUrl: './dettagli-macchina.component.scss'
})
export class DettagliMacchinaComponent {

  car:iCar | undefined ={
    brand: "",
    brandLogo: "",
    model: "",
    modelImage: "",
    year: 0,
    price: 0,
    available: false
  }
  constructor(private router:ActivatedRoute, private carSvc:CarService){}

  ngOnInit(){
    this.router.params.subscribe((route:any) => {
      this.carSvc.getCarByModel(route)
      .then(res => {
        this.car = res
      })
    })
  }
}
