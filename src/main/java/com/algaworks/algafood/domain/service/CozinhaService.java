package com.algaworks.algafood.domain.service;

import org.springframework.stereotype.Service;

import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.repository.CozinhaRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CozinhaService {

	private final CozinhaRepository cozinhaRepository;
	
	public Cozinha salvar(Cozinha cozinha) {
		return cozinhaRepository.salvar(cozinha);
	}
}
