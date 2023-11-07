package com.abby;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.abby") 
public class Topic12Application {

	public static void main(String[] args) {
		SpringApplication.run(Topic12Application.class, args);
	}

}
