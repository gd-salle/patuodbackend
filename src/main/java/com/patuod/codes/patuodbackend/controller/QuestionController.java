package com.patuod.codes.patuodbackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.patuod.codes.patuodbackend.model.Question;
import com.patuod.codes.patuodbackend.repository.QuestionRepository;

@RestController
public class QuestionController {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@GetMapping("/game")
	List<Question> getAllQuestion(){
		return questionRepository.findAll();
	}
	
	@GetMapping("/game/{id}")
	Optional<Question> getQuestionByID(@PathVariable Long id) {
		return questionRepository.findById(id);
	}
}
