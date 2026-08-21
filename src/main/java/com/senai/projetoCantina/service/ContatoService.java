package com.senai.projetoCantina.service;

import com.senai.projetoCantina.model.Contato;
import com.senai.projetoCantina.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository contatoRepository;
    
    public List<Contato> listarTodos() {
        return contatoRepository.findAll();
    }

    public Contato salvar(Contato contato) {
        if (contato.getCliente() == null && contato.getFuncionario() == null) {
            throw new IllegalArgumentException("Erro de validação: O contato deve estar vinculado a um cliente ou a um funcionário.");
        }
        return contatoRepository.save(contato);
    }

    public Contato buscarPorId(Long id) {
        return contatoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contato não encontrado."));
    }

    public void deletar(Long id) {
        if (!contatoRepository.existsById(id)) {
            throw new RuntimeException("Contato não encontrado.");
        }
        contatoRepository.deleteById(id);
    }
}