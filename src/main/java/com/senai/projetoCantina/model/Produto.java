package com.senai.projetoCantina.model;

public class Produto {
	
	private Long id;
	private Categoria id_categoria;
	private String nome;
	
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

}
