package com.springcore;

public class Employee {

	private Long id;
	private String name;
	private String Address;

	public Employee(Long id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
	}

	public Employee() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
	public void showEmp()
	{
		System.out.println("Emp ID:"+id);
		System.out.println("Emp Name:"+name);
	}
}