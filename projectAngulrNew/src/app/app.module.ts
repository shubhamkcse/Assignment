import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeeAddComponent } from './employee-add/employee-add.component';
import { EmployeeUpdateComponent } from './employee-update/employee-update.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { EmployeeDeleteComponent } from './employee-delete/employee-delete.component';

@NgModule({
  declarations: [
    AppComponent,
    EmployeeAddComponent,
    EmployeeUpdateComponent,
    EmployeeListComponent,
    EmployeeDeleteComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
