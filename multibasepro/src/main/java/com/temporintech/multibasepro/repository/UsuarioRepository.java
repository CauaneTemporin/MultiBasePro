package com.temporintech.multibasepro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.temporintech.multibasepro.model.auth.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}