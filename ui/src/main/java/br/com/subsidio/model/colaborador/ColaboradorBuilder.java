package br.com.subsidio.model.colaborador;

public final class ColaboradorBuilder {

	private String nome;
	
	private ColaboradorBuilder() {
		this.nome = "João da Silva";
	}

	public static ColaboradorBuilder novo() {
		return new ColaboradorBuilder();
	}

	public ColaboradorBuilder chamado(String nome) {
		this.nome = nome;
		return this;
	}

	public Colaborador criar() {
		return new Colaborador(nome);
	}

}
