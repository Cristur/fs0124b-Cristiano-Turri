import { Component } from '@angular/core';
import { iTodo } from '../../models/todo';
import { TodoService } from '../../todo.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {

  todos: iTodo[] = []

  constructor(private todosSvc: TodoService){}
    ngOnInit(){
      this.todos = this.todosSvc.getAll()
    }
}
