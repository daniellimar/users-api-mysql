package com.daniellimar.client.demo.repository;

import com.daniellimar.client.demo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}