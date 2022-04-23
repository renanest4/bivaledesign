package com.projeto.bivale.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(ModelMap model) {
		model.addAttribute("nomeDoAtributo", "Bivale");
	
	return "home";
	}
	

}
