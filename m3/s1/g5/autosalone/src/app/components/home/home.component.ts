import { Component } from '@angular/core';
import { iCar } from '../../car';
import { CarService } from '../../car.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {

  randomCarsArr: iCar[] = [];

  constructor(private carsSvc:CarService){}

  ngOnInit(){
    this.carsSvc.getRandomCars(2, this.randomCarsArr)
    .then(car => {
      this.randomCarsArr = car
    })

  }

}
