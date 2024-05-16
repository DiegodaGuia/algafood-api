package com.algaworks.algafood.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algafood.domain.model.Estado;
import com.algaworks.algafood.domain.repository.EstadoRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/estados")
@AllArgsConstructor
public class EstadoController {
	
	private final EstadoRepository estadoRepository;
	
	@GetMapping
	public List<Estado> Listar() {
		return estadoRepository.listar();		
	}
}
