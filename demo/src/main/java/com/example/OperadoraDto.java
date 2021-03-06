package com.example;

import java.io.Serializable;

public class OperadoraDto implements Serializable {

	private String nome;
	private Integer codigo;
	private String categoria;

	public OperadoraDto(String nome, Integer codigo, String categoria) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
