package com.senai.projetoCantina.model;

import java.util.Objects;

public class Cliente {
	private Long id;
	private String nomeCliente;
	private String email;
	private String senha;
	
	public Cliente() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		Cliente cliente = (Cliente) o;
		return id != null && id.equals(cliente.id);
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(getClass());
		
	}

}
