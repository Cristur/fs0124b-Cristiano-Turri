import { Component, Input } from '@angular/core';
import { iTodo } from '../../models/todo';
import { TodoService } from '../../todo.service';

@Component({
  selector: 'app-singletodo',
  templateUrl: './singletodo.component.html',
  styleUrl: './singletodo.component.scss'
})
export class SingletodoComponent {

  todos:iTodo[] = []
  @Input() todo!: iTodo

  constructor(private todoSvc:TodoService){}
  check(id:number){
    this.todoSvc.check(id)
  }

}
