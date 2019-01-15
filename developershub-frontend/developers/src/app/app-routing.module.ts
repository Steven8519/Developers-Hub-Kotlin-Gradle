import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {DeveloperComponent} from "./components/developer/developer.component";

const routes: Routes = [
  {path: "", component: DeveloperComponent},
  {path: "developers", component: DeveloperComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
