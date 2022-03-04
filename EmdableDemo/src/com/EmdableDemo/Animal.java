package com.EmdableDemo;

import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class Animal {

	private String family;

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	@Override
	public int hashCode() {
		return Objects.hash(family);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(family, other.family);
	}

	@Override
	public String toString() {
		return "Animal [family=" + family + "]";
	}
}
