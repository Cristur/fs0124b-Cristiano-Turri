import { Component } from '@angular/core';
import { iCar } from '../../car';
import { CarService } from '../../car.service';

@Component({
  selector: 'app-audi',
  templateUrl: './audi.component.html',
  styleUrl: './audi.component.scss'
})
export class AudiComponent {
  carsArr: iCar[] = [];

  constructor(private carSvc:CarService){}

  ngOnInit(){
    this.carSvc.getAudiCars().then(car => {
      this.carsArr =car
    })

  }
}
