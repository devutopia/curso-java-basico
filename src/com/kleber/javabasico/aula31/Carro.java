package com.kleber.javabasico.aula31;

class Carro {
	
	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	private double consCombustivel;
	
	public void exibirAutonomia() {

		System.out.println("A autonomia do carro é: " + (this.capCombustivel * this.consCombustivel) + " km.");
	}

	public double obterAutonomia() {

		System.out.println("Método obterAutonomia foi chamado.");

		return this.capCombustivel * this.consCombustivel;
	}
	
	private double divideKMPorConsumoCombustível(double km){
		
		return km / this.consCombustivel;
	}

	public double calculaCombustivel(double km) {

		return this.divideKMPorConsumoCombustível(km);
	}

}
