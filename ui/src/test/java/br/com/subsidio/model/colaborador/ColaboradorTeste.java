package br.com.subsidio.model.colaborador;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.subsidio.model.colaborador.Colaborador;

public class ColaboradorTeste {
	
	private static final int ANO = 2016;

	@Test
	public void deve_pode_adicionar_um_valor_anual_por_colaborador() throws Exception {
		BigDecimal valorAnualEsperado = BigDecimal.valueOf(26000d);
		Colaborador colaborador = ColaboradorBuilder.novo().chamado("Higor Nucci").criar();
		
		colaborador.adicionar(valorAnualEsperado, ANO);
		
		assertEquals(valorAnualEsperado, colaborador.getValorAnualCedidoPara(ANO));
	}
}
