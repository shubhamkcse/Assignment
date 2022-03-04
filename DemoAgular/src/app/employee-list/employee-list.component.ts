import { Employee } from '../employee';
import { MyserviceService } from '../service/myservice.service';
import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  employeeList:Employee[] =[];
  
   @Input()
   emp!:Employee;
//	fisrt=0;
//	rows=10;
  constructor(private myService : MyserviceService) { }

   ngOnInit(): void {
	this.employeeList=this.myService.getEmployees();
  }
  share() {
        window.alert('The product has been shared!');
    }
 
    onNotify() {
        window.alert('You will be notified when the product goes on sale');
    }
    addToCart(employee: Employee) {
        this.myService.addEmployee(employee);
        window.alert('Your Employee has been added to the cart!');
    }
    
    listFromJSON() {
        //this.employeeListJSON = 
        let a=this.myService.getEmployeeFromJSONList();
        console.log(a.subscribe());
        console.log(typeof(a));
        return a;
    }

}
