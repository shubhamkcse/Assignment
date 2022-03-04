package com.example.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String cName;
	private String cDetails;
	
//	@ManyToOne
//	@JoinColumn(name ="Student_ID")
//	private Course courses;
//
//	public Course getCourses() {
//		return courses;
//	}
//	public void setCourses(Course courses) {
//		this.courses = courses;
	//}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcDetails() {
		return cDetails;
	}
	public void setcDetails(String cDetails) {
		this.cDetails = cDetails;
	}
}
