import { Component } from '@angular/core';
import { iTodo } from '../../models/todo';
import { TodoService } from '../../todo.service';

@Component({
  selector: 'app-completed',
  templateUrl: './completed.component.html',
  styleUrl: './completed.component.scss'
})
export class CompletedComponent {

  todos!:iTodo[]
  constructor(private todosSvc:TodoService){}

  ngOnInit(){
    this.todos = this.todosSvc.getCompleted()
  }
}
