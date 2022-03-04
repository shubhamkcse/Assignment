package com.example.web.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@EqualsAndHashCode
@ToString
public class Countrie {

	
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Long countryId;
	private String name;

	@ManyToOne
	@JoinColumn(name = "regionId")
	private Region regions;
	
	@OneToOne(mappedBy = "Countries")
	private CountriesCurrencie CountriesCurrencies;

//	@OneToOne(mappedBy = "address")
//    private User user;
	
	public Long getCountryId() {
		return countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Region getRegions() {
		return regions;
	}

	public void setRegions(Region regions) {
		this.regions = regions;
	}
}
