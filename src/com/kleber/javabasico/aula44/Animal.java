package com.kleber.javabasico.aula44;

public abstract class Animal {

	private String nome;

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract String emitirSom();
		
}
