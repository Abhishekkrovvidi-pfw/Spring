package com.abby.model;
import lombok.Data;
@Data
@Entity
public class Question {
	@org.springframework.data.annotation.Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String Language;
	private String difficultylevel;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String Question;
	private String rightAnswer;
	
	
	

}
