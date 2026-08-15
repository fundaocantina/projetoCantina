package com.senai.projetoCantina.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.projetoCantina.model.MovimentacaoEstoque;
import com.senai.projetoCantina.model.Produto;

public interface MovimentacaoEstoqueRepository extends JpaRepository<Produto, Long>{
	
	List<MovimentacaoEstoque> findByProdutoId(Long produtoId);
	Optional<MovimentacaoEstoque> findTopByProdutoIdOrderByDataMovimentacao(Long produtoId);}
