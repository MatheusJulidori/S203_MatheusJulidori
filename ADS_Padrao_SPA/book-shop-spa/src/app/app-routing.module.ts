import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookTableComponent } from './components/book-table/book-table.component';

const routes: Routes = [
  {
    path: 'booktable',
    component: BookTableComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
