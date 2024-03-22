import { Injectable, model } from '@angular/core';
import { iCar } from './car';

@Injectable({
  providedIn: 'root'
})
export class CarService {

getAllCars(): Promise<iCar[]>{

  return fetch("../assets/db.json")
  .then(car => car.json())
  .then(car => car)

}

getFiatCars():Promise<iCar[]>{
return this.getAllCars()
  .then(car => car.filter(c => c.brand == "Fiat"))

}

getFordCars():Promise<iCar[]>{
  return this.getAllCars()
    .then(car => car.filter(c => c.brand == "Ford"))

}
getAudiCars():Promise<iCar[]>{
  return this.getAllCars()
    .then(car => car.filter(c => c.brand == "Audi"))
}
getCarByModel(model:string):Promise<iCar | undefined>{
  return this.getAllCars()
  .then(car => car.find(c => c.model == model))
}

getRandomCars(n: number, array:iCar[]):Promise<iCar[]> {
  array = [];
  return this.getAllCars()
  .then(car => {
    for (let i = 0; i < n; i++) {
    let rand = Math.floor(Math.random() * car.length);
    array.push(car[rand]);
  }
  return array;
})

  }


}
