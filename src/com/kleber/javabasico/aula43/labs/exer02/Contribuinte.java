package com.kleber.javabasico.aula43.labs.exer02;

public class Contribuinte {
	private String nome;
	private String endereco;
	private double rendaBruta;
	
	public Contribuinte() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public double getRendaBruta() {
		return rendaBruta;
	}

	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}

	@Override
	public String toString() {
		String s = "Contribuinte \n";
		s += "Nome: " + nome + "\n";
		s += "Endereço: " + endereco + "\n";
		s += "Renda Bruta: " + rendaBruta + "\n";
		return s;
	}

	public double calcularImposto() {
		return 0;
	}
	
}
