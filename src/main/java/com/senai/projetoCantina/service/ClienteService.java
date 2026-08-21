package com.senai.projetoCantina.service;

import org.springframework.stereotype.Service;
import com.senai.projetoCantina.repository.ClienteRepository;

@Service
public class ClienteService {
	private final ClienteRepository clienteRepository;

	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	

}
