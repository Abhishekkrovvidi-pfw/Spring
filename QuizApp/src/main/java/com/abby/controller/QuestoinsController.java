package com.abby.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abby.model.Question;
import com.abby.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestoinsController {
	@Autowired
	QuestionService questionService;
	
	@GetMapping("/allQuestions")
	public List<Question> getAllQuestions() {
		return questionService.getAllQuestions();
	}
}
