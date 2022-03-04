import { Injectable } from '@angular/core';
import { Employee } from '../employee';

@Injectable({
  providedIn: 'root'
})
export class Myservice1Service {
private employeeList:Employee[] =[{
	id:1,
    name: 'XYZ',
	address:'pune',
	phone:'321683',
    dob: new Date('10/10/2022'),
    isActive: true
	}];
    
    constructor() {}
    
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
