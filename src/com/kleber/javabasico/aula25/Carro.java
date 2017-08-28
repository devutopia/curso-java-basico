package com.kleber.javabasico.aula25;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consCombustivel;	
	
	void exibirAutonomia(){
		
		System.out.println("A autonomia do carro é: " + (capCombustivel * consCombustivel) + " km.");
	}
}
