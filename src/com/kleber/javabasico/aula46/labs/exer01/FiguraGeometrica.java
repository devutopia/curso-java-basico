package com.kleber.javabasico.aula46.labs.exer01;

public class FiguraGeometrica {
	
	private String nome;
	private String cor;
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
	/**
	 * @return the cor
	 */
	public String getCor() {
		return cor;
	}
	/**
	 * @param cor the cor to set
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public String toString() {
		String s = "Nome: " + this.nome;
		s += "\nCor: " + this.cor;
		return s;
	}
}
