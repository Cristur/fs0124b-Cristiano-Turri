import { Component } from '@angular/core';
import { FilmService } from '../film.service';
import { iFilms } from '../../Models/i-films';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrl: './dashboard.component.scss'
})
export class DashboardComponent {

  constructor(private filmSvc:FilmService){}

  films:iFilms[] = []

  ngOnInit(){
    this.filmSvc.getAll()
    .subscribe(films => {
      this.films = films
    })

}

}
