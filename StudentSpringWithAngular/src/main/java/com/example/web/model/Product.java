package com.example.web.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer uniqueId;
	private String productname;
	private Double price;
	private String color;
	@Lob
	@Column(columnDefinition = "MEDIUMBLOB")
	private String image;

	public Integer getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(Integer uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Product [uniqueId=" + uniqueId + ", productname=" + productname + ", price=" + price + ", color="
				+ color + ", image=" + image + "]";
	}
	
	
}