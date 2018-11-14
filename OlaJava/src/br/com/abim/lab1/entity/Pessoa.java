package br.com.abim.lab1.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {
	private Long id;
	private String nome;
	private Date dataNasc;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	@Override
	public String toString() {
		SimpleDateFormat dateformat3 = new SimpleDateFormat("dd/MM/yyyy");

		return "Pessoa [id=" + id + ", nome=" + nome + ", dataNasc=" + dataNasc + "]";
	}

}
