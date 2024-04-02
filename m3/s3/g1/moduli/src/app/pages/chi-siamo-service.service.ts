import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ChiSiamoServiceService {

  constructor() { }
  isLoggedIn(){
    return false;
  }
}
