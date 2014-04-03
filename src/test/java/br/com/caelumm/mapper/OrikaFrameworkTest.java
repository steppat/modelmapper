package br.com.caelumm.mapper;

import junit.framework.Assert;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

import org.junit.Before;
import org.junit.Test;

import br.com.caelum.mapper.PedidoDto;
import br.com.caelum.mapper.modelo.Cliente;
import br.com.caelum.mapper.modelo.Endereco;
import br.com.caelum.mapper.modelo.Nome;
import br.com.caelum.mapper.modelo.Pedido;
import br.com.caelum.mapper.modelo.PedidoFlat;

public class OrikaFrameworkTest {

	private MapperFacade mapper;

	@Before
	public void setup() {		
		MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
		mapperFactory.classMap(PedidoFlat.class, PedidoDto.class).
			field("rua", "ruaDestino").
			field("cidade", "cidadeDestino").
			field("cep", "cepDestino").
			field("numero", "numeroDestino").
			field("nomeCliente", "cliente").
		register();
		
		mapperFactory.classMap(Pedido.class, PedidoDto.class).
			fieldAToB("destino.rua", "ruaDestino").
			fieldAToB("destino.cidade", "cidadeDestino").
			fieldAToB("destino.cep", "cepDestino").
			fieldAToB("destino.numero", "numeroDestino").
			fieldAToB("cliente.nome.primeiroNome", "cliente").
		register();
		
		
		this.mapper = mapperFactory.getMapperFacade();


	}
	
	
	@Test
	public void testMapperCreatesDtoFromFlatDomainObject() {
		
		PedidoFlat pedidoFlat = geraPedidoFlat();

		PedidoDto dto = mapper.map(pedidoFlat, PedidoDto.class);
		
		Assert.assertEquals(pedidoFlat.getRua(), dto.getRuaDestino());
		Assert.assertEquals(pedidoFlat.getCidade(), dto.getCidadeDestino());
		Assert.assertEquals(pedidoFlat.getCep(), dto.getCepDestino());
		Assert.assertEquals(pedidoFlat.getNomeCliente(), dto.getCliente());
	}

	
	
	@Test
	public void testMapperCreatesDomainObjectFromDto() {
		
		PedidoDto dto = geraPedidoDto();
		
		PedidoFlat pedidoFlat = mapper.map(dto, PedidoFlat.class);
		
		Assert.assertEquals(pedidoFlat.getNomeCliente(),dto.getCliente());
		Assert.assertEquals(pedidoFlat.getRua(),dto.getRuaDestino());
		Assert.assertEquals(String.valueOf(pedidoFlat.getNumero()), dto.getNumeroDestino());
		Assert.assertEquals(pedidoFlat.getCidade(),dto.getCidadeDestino());
		Assert.assertEquals(pedidoFlat.getCep(),dto.getCepDestino());
	}

	@Test
	public void testMapperCreatesDtoFromDeepObjectGraph() {
		
		Pedido pedido = geraPedido();
		
		PedidoDto dto = mapper.map(pedido, PedidoDto.class);
		
		Assert.assertEquals(pedido.getDestino().getNumero(), String.valueOf(dto.getNumeroDestino()));
		Assert.assertEquals(pedido.getDestino().getRua(), dto.getRuaDestino());
		Assert.assertEquals(pedido.getDestino().getCidade(), dto.getCidadeDestino());
		Assert.assertEquals(pedido.getDestino().getCep(), dto.getCepDestino());
		Assert.assertEquals(pedido.getCliente().getNome().getPrimeiroNome(), dto.getCliente());
	}

	private Pedido geraPedido() {
		Cliente cliente = clienteNico();
		Endereco destino = naRuaBuarqueDeMacedo();
		Pedido pedido = new Pedido(cliente, destino);
		return pedido;
	}
	

	private PedidoDto geraPedidoDto() {
		
		PedidoDto dto = new PedidoDto();
		dto.setCliente("Jo??o");
		dto.setRuaDestino("Catete");
		dto.setNumeroDestino("50");
		dto.setCidadeDestino("Rio");
		dto.setCepDestino("20040-030");
		return dto;
	}

	private PedidoFlat geraPedidoFlat() {
		PedidoFlat pedidoFlat = new PedidoFlat();
		pedidoFlat.setCep("20040-030");
		pedidoFlat.setCidade("Rio");
		pedidoFlat.setNomeCliente("Joao");
		pedidoFlat.setRua("Catete");
		return pedidoFlat;
	}

	private Cliente clienteNico() {
		Endereco endereco = new Endereco().
		comCep("20040-030").
		comCidade("Rio de Janeiro").
		comNumero("50").
		comRua("Rua do Ouvidor");

		return new Cliente(new Nome("Nico", "Steppat"), endereco);
	}

	private Endereco naRuaBuarqueDeMacedo() {
		Endereco endereco = new Endereco().
		comCep("22220-030").
		comCidade("Rio de Janeiro").
		comNumero("50").
		comRua("Rua Buarque de Macedo");
		
		return endereco;
	}
}
