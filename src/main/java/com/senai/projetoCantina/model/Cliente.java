package com.senai.projetoCantina.model;

import java.util.Objects;

public class Cliente {
	private Long id;
	private Long idTipoCliente;
	private String nome;
	private String matricula;
	
	public Cliente() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getIdTipoCliente() {
		return idTipoCliente;
	}

	public void setIdTipoCliente(String idTipoCliente) {
		this.idTipoCliente = idTipoCliente;
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
		return Objects.hash(id);
		
	}

}
