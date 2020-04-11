package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nelioalves.cursomc.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	//Colocando o nome do campo depois de findBy automaticamente faz e procura pelo campo indicado passando o campo como parametro
	// Ex.: findBy + email -> findByEmail
	@Transactional(readOnly=true)
	Cliente findByEmail(String email);
}
