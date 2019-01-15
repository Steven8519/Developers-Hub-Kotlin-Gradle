import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {DeveloperComponent} from './components/developer/developer.component';
import {RecruiterComponent} from './components/recruiter/recruiter.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {DeveloperlistComponent} from './components/developerlist/developerlist.component';
import {HttpClientModule} from "@angular/common/http";
import {HomeComponent} from './components/home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    DeveloperComponent,
    RecruiterComponent,
    DeveloperlistComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
