package com.senai.projetoCantina.service;

import org.springframework.stereotype.Service;
import com.senai.projetoCantina.repository.TipoClienteRepository;

@Service
public class TipoClienteService {
	private final TipoClienteRepository tipoClienteRepository;

	public TipoClienteService(TipoClienteRepository tipoClienteRepository) {
		this.tipoClienteRepository = tipoClienteRepository;
	}
	
	
}
