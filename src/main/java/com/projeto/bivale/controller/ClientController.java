package com.projeto.bivale.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.bivale.model.Cliente;
import com.projeto.bivale.repository.ClientRepository;

@RestController
@RequestMapping("/clientes")

public class ClientController {
	
	@Autowired
	private ClientRepository clientRepository;
	
	
	@GetMapping
	public List<Cliente> listar() {
		return clientRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus
	public Cliente adicionar (@RequestBody Cliente cliente) {
		return clientRepository.save(cliente);
	}
	

}
