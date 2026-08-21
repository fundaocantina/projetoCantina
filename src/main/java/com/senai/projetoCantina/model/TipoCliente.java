package com.senai.projetoCantina.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tipo_cliente")
public class TipoCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_cliente")
    private Long id;
    @Column(nullable = false, length = 30)
    private String nome;

    public TipoCliente() {
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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoCliente tipoCliente = (TipoCliente) o;
        return Objects.equals(id, tipoCliente.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}