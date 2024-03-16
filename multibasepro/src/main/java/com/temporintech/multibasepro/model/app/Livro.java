package com.temporintech.multibasepro.model.app;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "livro")
public class Livro {

	@Id
	private Long codigo;

	private String titulo;

	private String autor;

	private String tema;

	@Column(name = "nome_usuario")
	private String nomeUsuario;

}