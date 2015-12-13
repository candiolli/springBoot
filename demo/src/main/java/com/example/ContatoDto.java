package com.example;

import java.io.Serializable;
import java.util.Date;

public class ContatoDto implements Serializable{

	private String nome;
	private String telefone;
	private Date data;
	private OperadoraDto operadora;

	public ContatoDto(String nome, String telefone, Date data, OperadoraDto operadora) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.data = data;
		this.operadora = operadora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public OperadoraDto getOperadora() {
		return operadora;
	}

	public void setOperadora(OperadoraDto operadora) {
		this.operadora = operadora;
	}

}
