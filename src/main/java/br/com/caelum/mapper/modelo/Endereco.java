package br.com.caelum.mapper.modelo;

public class Endereco {

	private String rua;
	private String numero;
	private String cidade;
	private String cep;

	public String getRua() {
		return rua;
	}

	public String getNumero() {
		return numero;
	}

	public String getCidade() {
		return cidade;
	}

	public String getCep() {
		return cep;
	}

	public Endereco comCep(String cep) {
		this.cep = cep;
		return this;
	}

	public Endereco comCidade(String cidade) {
		this.cidade = cidade;
		return this;
	}

	public Endereco comNumero(String numero) {
		this.numero = numero;
		return this;
	}

	public Endereco comRua(String rua) {
		this.rua = rua;
		return this;
	}

}
