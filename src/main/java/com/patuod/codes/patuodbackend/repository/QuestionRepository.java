package com.patuod.codes.patuodbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patuod.codes.patuodbackend.model.Question;

public interface QuestionRepository extends JpaRepository<Question,Long>{
	
}
