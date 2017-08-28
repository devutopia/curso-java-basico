package com.kleber.javabasico.aula26;

import com.kleber.javabasico.aula26.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.exibirAutonomia();
		
		double autonomia = van.obterAutonomia();
		System.out.println("Autonia do carro é: " + autonomia);
		System.out.println("Autonia do carro é: " + van.obterAutonomia());

	}

}
