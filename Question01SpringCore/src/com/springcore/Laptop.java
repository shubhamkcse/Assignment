package com.springcore;

public class Laptop {

	private Long id;
	private String cpu; 
	private String ram;
	
	public Laptop() {
		super();
	}

	public Laptop(Long id, String cpu, String ram) {
		super();
		this.id = id;
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
