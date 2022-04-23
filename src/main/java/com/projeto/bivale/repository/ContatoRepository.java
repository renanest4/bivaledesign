package com.projeto.bivale.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.bivale.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long>{
	
}
