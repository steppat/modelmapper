package br.com.caelum.mapper.modelo;

public class Cliente {

	private Nome nome;
	private Endereco endereco;

	public Cliente(Nome nome, Endereco endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public Nome getNome() {
		return nome;
	}

}
