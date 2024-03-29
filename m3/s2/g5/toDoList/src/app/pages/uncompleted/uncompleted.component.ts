import { Component } from '@angular/core';
import { iTodo } from '../../models/todo';
import { TodoService } from '../../todo.service';

@Component({
  selector: 'app-uncompleted',
  templateUrl: './uncompleted.component.html',
  styleUrl: './uncompleted.component.scss'
})
export class UncompletedComponent {

  todos!: iTodo[]
  constructor (private todoSvc:TodoService){}

  ngOnInit(){
    this.todos = this.todoSvc.getUncompleted()
  }
}
