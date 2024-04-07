import { Component } from '@angular/core';
import { UserService } from '../user.service';
import { iUser } from '../../Models/i-user';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrl: './users.component.scss'
})
export class UsersComponent {
  constructor (private userSvc:UserService){

  }

  users:iUser[] =[]

  ngOnInit(){
    this.userSvc.getAll().subscribe( user => {
      this.users = user
    })
  }
}
