import { Component } from '@angular/core';
import { iCar } from '../../car';
import { CarService } from '../../car.service';

@Component({
  selector: 'app-ford',
  templateUrl: './ford.component.html',
  styleUrl: './ford.component.scss'
})
export class FordComponent {

  carsArr: iCar[] = [];

  constructor(private carSvc:CarService){}

  ngOnInit(){
    this.carSvc.getFordCars().then(car => {
      this.carsArr =car
    })

  }
}
