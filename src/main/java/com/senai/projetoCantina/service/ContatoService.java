package com.senai.projetoCantina.service;

import org.springframework.stereotype.Service;
import com.senai.projetoCantina.repository.ContatoRepository;

@Service
public class ContatoService {
	private final ContatoRepository contatoRepository;

	public ContatoService(ContatoRepository contatoRepository) {
		this.contatoRepository = contatoRepository;
	}
	
	

}
