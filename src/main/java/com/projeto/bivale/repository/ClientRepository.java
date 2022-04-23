package com.projeto.bivale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.bivale.model.Cliente;

@Repository
public interface ClientRepository extends JpaRepository<Cliente, Long>{
	
}
