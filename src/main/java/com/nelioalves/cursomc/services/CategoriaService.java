package com.nelioalves.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.repositories.CategoriaRepository;
import com.nelioalves.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	/* VERSÃO ANTERIOR DO SPRING
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		return obj;
	}
	
	public Categoria find(Integer id) {  
		Optional<Categoria> obj = repo.findById(id);  
		
		
		return obj.orElse(null); 
	}
	*/
	
	public Categoria find(Integer id) {  
		Optional<Categoria> obj = repo.findById(id);  
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName())); } 
}
