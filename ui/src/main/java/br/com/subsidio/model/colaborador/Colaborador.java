package br.com.subsidio.model.colaborador;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Colaborador {

	private String nome;
	
	private Map<Integer, BigDecimal> valoresAnuais = new HashMap<>();

	public Colaborador(String nome) {
		this.nome = nome;
	}

	public void adicionar(BigDecimal valorAnualEsperado, int ano) {
		this.valoresAnuais.put(ano, valorAnualEsperado);
	}
	
	public String getNome() {
		return nome;
	}

	public BigDecimal getValorAnualCedidoPara(int ano) {
		return this.valoresAnuais.get(ano);
	}
}