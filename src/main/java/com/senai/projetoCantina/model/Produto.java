package com.senai.projetoCantina.model;

import java.util.Objects;

public class Produto {
	
	private Long id;
	private Categoria id_categoria;
	private String nome;
	
	public Produto() {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	//=============================
	public Categoria getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(Categoria id_categoria) {
		this.id_categoria = id_categoria;
	}
	//=============================
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//=============================
	@Override
	public boolean equals(Object o) {
		if(this == o)return true;
		if(o == null||getClass()!= o.getClass())return false;
		Produto produto = (Produto) o;
		return id != null && id.equals(produto.id);
	}
	@Override 
	public int hashCode() {
		return Objects.hash(getClass());
	}
	

}
