package com.senai.projetoCantina.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.projetoCantina.model.TipoCliente;
import com.senai.projetoCantina.repository.TipoClienteRepository;

@Service
public class TipoClienteService {
	
	@Autowired
	private TipoClienteRepository tipoClienteRepository;

	public List<TipoCliente> listarTodos(){
		return tipoClienteRepository.findAll();
	}
	
	public TipoCliente salvar(TipoCliente tipoCliente) {
		if (tipoCliente.getNome() == null || tipoCliente.getNome().isBlank()) {
			throw new IllegalArgumentException("Erro: O nome do tipo de cliente é obrigatório.");
		}
		return tipoClienteRepository.save(tipoCliente);
	}
	
	public TipoCliente buscarPorId(Long id) {
		return tipoClienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tipo de Cliente não encontrado"));
	}
	
	public void deletar(Long id) {
		buscarPorId(id); 
		tipoClienteRepository.deleteById(id);
	}
	
}