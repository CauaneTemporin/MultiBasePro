package com.temporintech.multibasepro.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.temporintech.multibasepro.model.app.Livro;
import com.temporintech.multibasepro.model.auth.Usuario;
import com.temporintech.multibasepro.repository.app.LivroRepository;
import com.temporintech.multibasepro.repository.auth.UsuarioRepository;
import com.temporintech.multibasepro.service.LivroService;

@Service
public class LivroServiceImpl implements LivroService{

	@Autowired
	private LivroRepository livroRepository;
	
	@Autowired 
	private UsuarioRepository usuarioRepository;
	
	@Override
	public List<Livro> obterLivros() {
		return this.livroRepository.findAll();
	}

	@Override
	public Livro criar(Livro livro) {

		Usuario usuario = this.usuarioRepository
				.findById(livro.getCodigoUsuario())
				.orElseThrow(() -> new IllegalArgumentException("Usuário não encontrado."));

		livro.setNomeUsuario(usuario.getNome());
		
		return this.livroRepository.save(livro);
	}

}
