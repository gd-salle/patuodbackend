package com.patuod.codes.patuodbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Question {
	
	@Id
	@GeneratedValue
	private Long questionID;
	private String question;
	private String answer;
	
	@ManyToOne
	@JoinColumn(name = "categoryID")
	private Category categoryID;
	

	public Long getId() {
		return questionID;
	}
	public void setId(Long id) {
		this.questionID = id;
	}
	public Category getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(Category categoryID) {
		this.categoryID = categoryID;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
