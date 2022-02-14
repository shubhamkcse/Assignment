package com.oneToOne;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
	 	private long employeeID;
	    private String departmentName;
	    
	    @OneToOne(cascade = CascadeType.ALL)
	    private Laptop laptop;
	    
	    @OneToOne(cascade = CascadeType.ALL)
	    private Person person;

		public Employee(long employeeID, String departmentName, Laptop laptop, Person person) {
			super();
			this.employeeID = employeeID;
			this.departmentName = departmentName;
			this.laptop = laptop;
			this.person = person;
		}

		public Employee() {
			super();
		}

		public Employee(String departmentName) {
			super();
			this.departmentName = departmentName;
		}

		public long getEmployeeID() {
			return employeeID;
		}

		public void setEmployeeID(long employeeID) {
			this.employeeID = employeeID;
		}

		public String getDepartmentName() {
			return departmentName;
		}

		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}

		public Laptop getLaptop() {
			return laptop;
		}

		public void setLaptop(Laptop laptop) {
			this.laptop = laptop;
		}

		public Person getPerson() {
			return person;
		}

		public void setPerson(Person person) {
			this.person = person;
		}

		@Override
		public int hashCode() {
			return Objects.hash(departmentName, employeeID, laptop, person);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			return Objects.equals(departmentName, other.departmentName) && employeeID == other.employeeID
					&& Objects.equals(laptop, other.laptop) && Objects.equals(person, other.person);
		}

		@Override
		public String toString() {
			return "Employee [employeeID=" + employeeID + ", departmentName=" + departmentName + ", laptop=" + laptop
					+ ", person=" + person + "]";
		}  
}
