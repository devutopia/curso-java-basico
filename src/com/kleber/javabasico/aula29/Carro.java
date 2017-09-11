package com.kleber.javabasico.aula29;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consCombustivel;
	
	public Carro(){
		System.out.println("Classe Carro inst�nciada");
		numPassageiros = 4;
	}
	
	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consCombustivel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consCombustivel = consCombustivel;
	}

	void exibirAutonomia(){
		
		System.out.println("A autonomia do carro �: " + (capCombustivel * consCombustivel) + " km.");
	}
	
	double obterAutonomia(){
		
		System.out.println("M�todo obterAutonomia foi chamado.");
		
		return capCombustivel * consCombustivel;
	}
	
	double calculaCombustivel (double km){
		
		double qtdCombustivel = km/consCombustivel;
		
		return qtdCombustivel;
	}
}
