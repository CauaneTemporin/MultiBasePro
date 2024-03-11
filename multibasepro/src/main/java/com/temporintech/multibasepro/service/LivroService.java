package com.temporintech.multibasepro.service;

import java.util.List;

import com.temporintech.multibasepro.model.app.Livro;

public interface LivroService {

	public List<Livro> obterLivros();

	public Livro criar(Livro livro);
}