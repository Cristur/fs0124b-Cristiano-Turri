import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { FiatComponent } from './components/fiat/fiat.component';
import { FordComponent } from './components/ford/ford.component';
import { AudiComponent } from './components/audi/audi.component';
import { DettagliMacchinaComponent } from './components/dettagli-macchina/dettagli-macchina.component';

const routes: Routes = [
  {
    path: "",
    component: HomeComponent
  },
  {
    path: "Fiat",
    component: FiatComponent
  },
  {
    path: "Ford",
    component: FordComponent
  },
  {
    path:"Audi",
    component: AudiComponent
  },
  {
    path: "car/:model",
    component: DettagliMacchinaComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
