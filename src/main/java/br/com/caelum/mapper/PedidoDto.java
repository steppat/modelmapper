package br.com.caelum.mapper;

import java.util.List;

public class PedidoDto {
	
	private String cliente;
	
	private String ruaDestino;
	private String numeroDestino;
	private String cidadeDestino;
	private String cepDestino;
	
	private List<ProdutoDto> produtos;

	public List<ProdutoDto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<ProdutoDto> produtos) {
		this.produtos = produtos;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getRuaDestino() {
		return ruaDestino;
	}

	public void setRuaDestino(String ruaDestino) {
		this.ruaDestino = ruaDestino;
	}

	public String getCidadeDestino() {
		return cidadeDestino;
	}

	public void setCidadeDestino(String cidadeDestino) {
		this.cidadeDestino = cidadeDestino;
	}

	public String getCepDestino() {
		return cepDestino;
	}

	public void setCepDestino(String cepDestino) {
		this.cepDestino = cepDestino;
	}

	public String getNumeroDestino() {
		return numeroDestino;
	}

	public void setNumeroDestino(String numeroDestino) {
		this.numeroDestino = numeroDestino;
	}

}
