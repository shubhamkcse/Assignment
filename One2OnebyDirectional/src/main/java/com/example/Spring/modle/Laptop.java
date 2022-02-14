package com.example.Spring.modle;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Laptop implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7602843439147977887L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long lId;
	private String brand,cpu,ram;
	
	
	@OneToOne
	@JoinColumn(name = "laptop_id")
	private Employee employee;

	public Long getlId() {
		return lId;
	}

	public void setlId(Long lId) {
		this.lId = lId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
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

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, cpu, employee, lId, ram);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(cpu, other.cpu)
				&& Objects.equals(employee, other.employee) && Objects.equals(lId, other.lId)
				&& Objects.equals(ram, other.ram);
	}

	@Override
	public String toString() {
		return "Laptop [lId=" + lId + ", brand=" + brand + ", cpu=" + cpu + ", ram=" + ram + ", employee=" + employee
				+ "]";
	}
	
	
}
