import { HttpBackend, HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from '../../environments/environment.development';
import { iUser } from '../Models/i-user';
import { BehaviorSubject, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http:HttpClient) { }

  apiUrl:string = environment.usersUrl

  films:iUser[] = []

  userSubject = new BehaviorSubject<iUser[]>([]);

  user$ = this.userSubject.asObservable()

  getAll(): Observable<iUser[]>{
    return this.http.get<iUser[]>(this.apiUrl)
  }



}
