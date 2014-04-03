package br.com.caelumm.mapper;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.dozer.DozerBeanMapper;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.caelum.mapper.PedidoDto;
import br.com.caelum.mapper.modelo.PedidoFlat;


public class DozerFrameworkTest {
	
	private static DozerBeanMapper mapper;

	@BeforeClass
	public static void setup() {
		List<String> list = new ArrayList<String>();
		list.add("dozerMapping.xml");
		mapper = new DozerBeanMapper(list);
	}
	
	
	@Test
	public void testMapperCreatesDtoFromFlatDomainObject() {
		
		PedidoFlat pedidoFlat = geraPedidoFlat();
		String mapIdNoXml = "pedidoFlat";
		
		PedidoDto dto = mapper.map(pedidoFlat, PedidoDto.class, mapIdNoXml);
		
		Assert.assertEquals(String.valueOf(pedidoFlat.getNumero()), dto.getNumeroDestino());
	}

	private PedidoFlat geraPedidoFlat() {
		PedidoFlat pedidoFlat = new PedidoFlat();
		pedidoFlat.setCep("20040-030");
		pedidoFlat.setCidade("Rio");
		pedidoFlat.setNomeCliente("Nome");
		pedidoFlat.setRua("Catete");
		pedidoFlat.setNumero(50);
		return pedidoFlat;
	}
}
