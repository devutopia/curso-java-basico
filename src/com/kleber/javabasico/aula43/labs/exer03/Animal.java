package com.kleber.javabasico.aula43.labs.exer03;

public class Animal {
	private String nome;
	private double comprimento;
	private int numPatas;
	private String ambiente;
	private String cor;
	private double velocidade;
	
	public Animal() {
		this.numPatas = 4;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public int  getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	@Override
	public String toString() {
		String s = "Animal: " + nome;
		s += "\nComprimento: " + comprimento + "cm";
		s += "\nQtd. Patas: " + numPatas;
		s += "\nAmbiente: " + ambiente;
		s += "\nCor: " + cor;
		s += "\nVelocidade: " + velocidade + " m/s";
		
		return s;
	}
	
	
	
}
