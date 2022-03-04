package com.EmdableDemo;

import java.util.Objects;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Loin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String breed;
	
	@Embedded
	private Animal animal;

	
	public Loin() {
		super();
	}


	public Loin(Animal animal) {
		super();
		this.animal = animal;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getBreed() {
		return breed;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}


	public Animal getAnimal() {
		return animal;
	}


	public void setAnimal(Animal animal) {
		this.animal = animal;
	}


	@Override
	public int hashCode() {
		return Objects.hash(animal, breed, id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loin other = (Loin) obj;
		return Objects.equals(animal, other.animal) && Objects.equals(breed, other.breed)
				&& Objects.equals(id, other.id);
	}


	@Override
	public String toString() {
		return "Loin [id=" + id + ", breed=" + breed + ", animal=" + animal + "]";
	}
	
	
}
