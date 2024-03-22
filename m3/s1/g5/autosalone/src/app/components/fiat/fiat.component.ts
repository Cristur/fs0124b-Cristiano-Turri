import { Component } from '@angular/core';
import { iCar } from '../../car';
import { CarService } from '../../car.service';

@Component({
  selector: 'app-fiat',
  templateUrl: './fiat.component.html',
  styleUrl: './fiat.component.scss'
})
export class FiatComponent {

  carsArr: iCar[] = [];

  constructor(private carSvc:CarService){}

  ngOnInit(){
    this.carSvc.getFiatCars().then(car => {
      this.carsArr = car
    })

  }
}
