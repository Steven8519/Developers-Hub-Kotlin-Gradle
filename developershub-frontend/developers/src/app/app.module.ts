import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {DeveloperComponent} from './components/developer/developer.component';
import {RecruiterComponent} from './components/recruiter/recruiter.component';

@NgModule({
  declarations: [
    AppComponent,
    DeveloperComponent,
    RecruiterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
