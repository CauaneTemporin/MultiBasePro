package com.temporintech.multibasepro.model.auth;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	private Long codigo;

	private String nome;

	private String email;

	private String senha;
}