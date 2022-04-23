package com.projeto.bivale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.projeto.bivale.model.Contato;
import com.projeto.bivale.repository.ContatoRepository;

@Controller
@RequestMapping("/contatos/")
public class ContatoController {
	
	@Autowired
	ContatoRepository contatoRepository;
	
	@GetMapping("novo")
	public String novoDepartamento(Contato contato)
	{
		return "contato";
	}
	
	@PostMapping("add")
	public String addDepartamendo( Contato contato, 
			BindingResult result, Model model)
	{
		if(result.hasErrors()) {
			return "contato";
		}
		
		contatoRepository.save(contato);
		return "redirect:/home";
	}
	
	@GetMapping("list")
	public String getAllContatos(Model model) {
		model.addAttribute("listcontatos", contatoRepository.findAll());
		return "listaContatos";
	}
}
