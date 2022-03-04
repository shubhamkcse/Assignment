import { Injectable } from '@angular/core';
import { Employee } from '../employee';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class MyserviceService {
   
private employeeList:Employee[] =[{
	id:1,
    name: 'XYZ',
	address:'pune',
	phone:'321683',
    dob: new Date('10/10/2022'),
    isActive: true
	}];
    
    constructor(private httpClient: HttpClient) {
	let response = httpClient.get("");
	console.log(response.subscribe());
}
	
	gelListEmployee(){
		return this.employeeList;
	}
	
	clearEmployee(){
		this.employeeList=[];
		return this.employeeList;
	}
	
	 getEmployeeFromJSONList() {
		return this.httpClient.get<{name:String,city:string}[]>('/assets/employee.json');
        //throw new Error('Method not implemented.');
    }
    
    getEmployees() {
        return this.employeeList
    }
    getEmployeeByID(id: number) {
        return this.employeeList.find(x => x.id == id)
    }
    addEmployee(employee: Employee) {
        employee.id = new Date().getTime();
        this.employeeList.push(employee);
    }
    updateEmployee(employee: Employee) {
        const employeeIndex = this.employeeList.findIndex(x => x.id == employee.id);
        if (employeeIndex  != null && employeeIndex  != undefined) {
            this.employeeList[employeeIndex ] = employee;
        }
    }
    removeEmployee(id: number) {
        this.employeeList = this.employeeList.filter(x => x.id != id);
    }

}
