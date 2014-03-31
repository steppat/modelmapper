package br.com.caelumm.mapper.modelo;

public class Pedido {
	
	private Cliente cliente;
	private Endereco destino;
	
	

	public Pedido(Cliente cliente, Endereco destino) {
		this.cliente = cliente;
		this.destino = destino;
	}


	public Cliente getCliente() {
		return cliente;
	}
	
	public Endereco getDestino() {
		return destino;
	}
	
}
