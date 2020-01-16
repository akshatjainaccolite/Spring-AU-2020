import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FormComponent } from './form/form.component';
import { DetailsComponent } from './details/details.component';


const routes: Routes = [{path:'form',component:FormComponent},
                        {path:'detail',component:DetailsComponent},
                        {path:'',component:FormComponent},
                        {path:'**',component:FormComponent}
                      ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
