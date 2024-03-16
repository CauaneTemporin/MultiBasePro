package com.temporintech.multibasepro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.temporintech.multibasepro.model.app.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

}