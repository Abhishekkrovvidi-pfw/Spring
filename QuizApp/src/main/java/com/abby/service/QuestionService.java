package com.abby.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abby.dao.QuestionDao;
import com.abby.model.Question;

@Service
public class QuestionService {
	@Autowired
	QuestionDao questionDao;
	
	public List<Question>getAllQuestions(){
		questionDao.getAllQuestions();
		return null;
	}
	
	

}
