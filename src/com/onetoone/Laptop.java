package com.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String cpu; 
	private String ram;
	
	@OneToOne(targetEntity=Employee.class)  
	private Employee employee; 
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Laptop() {
		super();
	}

	public Laptop(String cpu, String ram) {
		super();
		this.cpu = cpu;
		this.ram = ram;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}
	
	public void showLaptop()
	{
		System.out.println("Lap ID:"+id);
		System.out.println("Lap cpu:"+cpu);
		System.out.println("Lap ram:"+ram);
	}
}
