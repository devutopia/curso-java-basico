package com.kleber.javabasico.aula27;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consCombustivel;
	
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
