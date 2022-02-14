package com.onetoMany;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long pId;
	private String pName,pAddress;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Employee employee;
	@OneToMany(cascade = CascadeType.ALL)
	private Laptop laptop;
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Person() {
		super();
	}

	public Person(String pName, String pAddress) {
		super();
		this.pName = pName;
		this.pAddress = pAddress;
	}

	public long getpId() {
		return pId;
	}

	public void setpId(long pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpAddress() {
		return pAddress;
	}

	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}

	@Override
	public int hashCode() {
		return Objects.hash(pAddress, pId, pName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(pAddress, other.pAddress) && pId == other.pId && Objects.equals(pName, other.pName);
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", pAddress=" + pAddress + "]";
	}
	
}
