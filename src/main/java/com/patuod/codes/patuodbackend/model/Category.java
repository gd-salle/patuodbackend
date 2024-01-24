package com.patuod.codes.patuodbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Category {
	@Id
	@GeneratedValue
	private Long categoryID;
	private String categoryName;
	
	public Long getId() {
		return categoryID;
	}
	public void setId(Long id) {
		this.categoryID = id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}
