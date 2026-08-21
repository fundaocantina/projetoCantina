package com.senai.projetoCantina.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Long id;
    @Column(nullable = false, length = 120)
    private String nome;
    @Column(length = 30)
    private String matricula;
    @ManyToOne
    @JoinColumn(name = "id_tipo_cliente")
    private TipoCliente tipoCliente;
    //=============================
    public Cliente() {
    	
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
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    //=============================
    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }
    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    //=============================
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}