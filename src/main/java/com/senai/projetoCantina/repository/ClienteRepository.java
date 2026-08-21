package com.senai.projetoCantina.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.senai.projetoCantina.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
