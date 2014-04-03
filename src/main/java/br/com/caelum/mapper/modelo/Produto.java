package br.com.caelum.mapper.modelo;

public class Produto {
	
	private String nome;
	private String codigo;
	
	public Produto(String nome, String codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCodigo() {
		return codigo;
	}

}
