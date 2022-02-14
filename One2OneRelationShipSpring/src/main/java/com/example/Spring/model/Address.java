package com.example.Spring.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8823970859557885845L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long addId;
	private String street, city, pin;
	public Long getAddId() {
		return addId;
	}
	public void setAddId(Long addId) {
		this.addId = addId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(addId, city, pin, street);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(addId, other.addId) && Objects.equals(city, other.city) && Objects.equals(pin, other.pin)
				&& Objects.equals(street, other.street);
	}
	@Override
	public String toString() {
		return "Address [addId=" + addId + ", street=" + street + ", city=" + city + ", pin=" + pin + "]";
	}
	
	
}
