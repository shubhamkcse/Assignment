import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { Myservice1Service } from '../service/myservice1.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

	employeeList:Employee[] =[];
//	fisrt=0;
//	rows=10;
  constructor(private myService : Myservice1Service) { }
  

  ngOnInit(): void {
	this.employeeList=this.myService.getEmployees();
  }

}
