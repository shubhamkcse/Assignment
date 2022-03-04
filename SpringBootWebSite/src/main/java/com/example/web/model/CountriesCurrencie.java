package com.example.web.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@EqualsAndHashCode
@ToString
public class CountriesCurrencie {

	@Id
	private Long currencyId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "countryId")
	private Countrie Countries;
	
//	@OneToOne(cascade = CascadeType.ALL)
//  @JoinColumn(name = "address_id", referencedColumnName = "id")
//  private Address address;
	
	public Long getCurrencyId() {
		return currencyId;
	}
	public void setCurrencyId(Long currencyId) {
		this.currencyId = currencyId;
	}
	public Countrie getCountries() {
		return Countries;
	}
	public void setCountries(Countrie countries) {
		Countries = countries;
	}
	
}
