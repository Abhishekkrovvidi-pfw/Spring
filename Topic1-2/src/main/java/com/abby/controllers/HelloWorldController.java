package com.abby.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.abby.models.Person;



@Controller
public class HelloWorldController {
	@GetMapping("/test1")
	@ResponseBody
	public String printHello() {
		return "HELLO WORLD";
	}
	
		@GetMapping("/test2")
		public String showHelloPage(Model model) {
			model.addAttribute("message", "Have a nice day");
			model.addAttribute("rating","todays news");
			model.addAttribute("a","ajhsajdfha");
			return "helloPage";
		}
		@GetMapping("/test3")
		public ModelAndView printHello1() {
			ModelAndView mv = new ModelAndView();
			mv.addObject("message", "Have a super day");
			mv.setViewName("helloPage");
			return mv;
		}
		@GetMapping("/test4")
		public String showHelloPage4(@RequestParam("message") String message, Model model) {
			model.addAttribute("message", message);
			model.addAttribute("rating","todays news");
			model.addAttribute("a","ajhsajdfha");
			return "helloPage";
		}
		@GetMapping("/people")
		public String showPeople(Model model) {
			List<Person>people = new ArrayList<Person>();
			people.add(new Person(0,"Abby",23, 70));
			people.add(new Person(1,"Subbu",24,75));
			people.add(new Person(2,"Visu",25,144));
			people.add(new Person(3,"Siddu",26,80));
			System.out.println(people);
			model.addAttribute("people", people);
			return "printPeople.html ";
		}
		
		@GetMapping("/peopleJson")
		@ResponseBody
		public List<Person> showPeopleJson(Model model) {
			List<Person>people = new ArrayList<Person>();
			people.add(new Person(0,"Abby",23, 70));
			people.add(new Person(1,"Subbu",24,75));
			people.add(new Person(2,"Visu",25,144));
			people.add(new Person(3,"Siddu",26,80));
			System.out.println(people);
			model.addAttribute("people", people);
			return people;
		}
}
