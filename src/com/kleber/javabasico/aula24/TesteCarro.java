package com.kleber.javabasico.aula24;

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
		
		Carro fusca = new Carro();
		fusca.marca = "Fusca";
		fusca.modelo = "Volkswagen";
		fusca.numPassageiros = 4;
		fusca.capCombustivel = 40;
		fusca.consCombustivel = 0.2;
		
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);

	}

}
