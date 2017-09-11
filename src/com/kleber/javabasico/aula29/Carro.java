package com.kleber.javabasico.aula29;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consCombustivel;
	
	public Carro(){
		System.out.println("Classe Carro instânciada");
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
		
		System.out.println("A autonomia do carro é: " + (capCombustivel * consCombustivel) + " km.");
	}
	
	double obterAutonomia(){
		
		System.out.println("Método obterAutonomia foi chamado.");
		
		return capCombustivel * consCombustivel;
	}
	
	double calculaCombustivel (double km){
		
		double qtdCombustivel = km/consCombustivel;
		
		return qtdCombustivel;
	}
}
