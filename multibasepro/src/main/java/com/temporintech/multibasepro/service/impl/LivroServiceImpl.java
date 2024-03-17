package com.temporintech.multibasepro.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.temporintech.multibasepro.model.app.Livro;
import com.temporintech.multibasepro.repository.app.LivroRepository;
import com.temporintech.multibasepro.service.LivroService;

@Service
public class LivroServiceImpl implements LivroService{

	@Autowired
	private LivroRepository livroRepository;
	
	@Override
	public List<Livro> obterLivros() {
		return this.livroRepository.findAll();
	}

	@Override
	public Livro criar(Livro livro) {
		return null;
	}

}