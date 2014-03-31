package br.com.caelumm.mapper;

public class PedidoDto {
	
	private String primeroNomeCliente;
	private String ruaDestino;
	private String numeroDestino;
	private String cidadeDestino;
	private String cepDestino;

	public String getPrimeroNomeCliente() {
		return primeroNomeCliente;
	}

	public void setPrimeroNomeCliente(String primeroNomeCliente) {
		this.primeroNomeCliente = primeroNomeCliente;
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
