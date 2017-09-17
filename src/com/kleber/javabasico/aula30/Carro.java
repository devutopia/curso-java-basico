package com.kleber.javabasico.aula30;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consCombustivel;
	
	

	public Carro() {
		
	}

	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consCombustivel = consCombustivel;
	}
	
	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando o contrutor com 3 parâmetros");
	}

	public Carro(String marca, String modelo) {
		this(marca, modelo, 10);
		System.out.println("Chamando o construtor com 2 parâmetros");
	}

	void exibirAutonomia(){
		
		System.out.println("A autonomia do carro é: " + (this.capCombustivel * this.consCombustivel) + " km.");
	}
	
	

	double obterAutonomia(){
		
		System.out.println("Método obterAutonomia foi chamado.");
		
		return this.capCombustivel * this.consCombustivel;
	}
	
	double calculaCombustivel (double km){
		
		double qtdCombustivel = km/this.consCombustivel;
		
		return qtdCombustivel;
	}
}
