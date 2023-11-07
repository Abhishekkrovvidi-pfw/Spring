package com.abby.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.abby.models.Games;

@Controller
public class SteamController {
	@GetMapping("/games")

	public String printGames(Model model) {
		List<Games> games = new ArrayList<Games>();
		games.add(new Games(1,"COunter Strike 2", 2176.2f));
		games.add(new Games(2,"GTA V", 382f));
		games.add(new Games(3,"PUBG", 198.4f));
		games.add(new Games(4,"SLEEPING DOGS", 95.2f));
		System.out.println(games);
		return ("index");
	
	}
}
