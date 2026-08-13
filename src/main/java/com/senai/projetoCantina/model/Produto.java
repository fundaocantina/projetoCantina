package com.senai.projetoCantina.model;

import java.util.Objects;

public class Produto {
	
	private Long id;
	private double precoVendas;
	private String nome;
	private Categoria categoria;
	
	public Produto() {
		
	}
	//=============================
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	//=============================
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//=============================
	public double getPrecoVendas() {
		return precoVendas;
	}
	public void setPrecoVendas(double precoVendas) {
		this.precoVendas = precoVendas;
	}
	//=============================
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	//========================================================
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
