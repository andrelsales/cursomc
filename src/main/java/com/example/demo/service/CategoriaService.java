package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Categoria;
import com.example.demo.repositories.CategoriaRepository;
import com.example.demo.service.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public Categoria buscar(Integer id) {

		Optional<Categoria> categoria = categoriaRepository.findById(id);
		
		return categoria.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
		
//		return categoria.orElse(null);
	}

}
