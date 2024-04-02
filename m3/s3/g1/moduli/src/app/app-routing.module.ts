import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GuardGuard } from './pages/guard.guard';

const routes: Routes = [{ path: '', loadChildren: () => import('./pages/home/home.module').then(m => m.HomeModule) },
 { path: 'chi-siamo', loadChildren: () => import('./pages/chi-siamo/chi-siamo.module').then(m => m.ChiSiamoModule) },
  { path: 'contattaci', loadChildren: () => import('./pages/contattaci/contattaci.module').then(m => m.ContattaciModule),
canActivate : [GuardGuard],
canActivateChild: [GuardGuard] }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
