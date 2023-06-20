package com.kleber.javabasico.aula25;

import com.kleber.javabasico.aula25.Carro;

public class TesteCarro {

	public static void main(String[] args) {
	
		Carro van = new Carro();
		van.marca = "Honda";
		van.modelo = "HR-V";
		van.numPassageiros = 5;
		van.capCombustivel = 55;
		van.consCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.exibirAutonomia();
	}

}
