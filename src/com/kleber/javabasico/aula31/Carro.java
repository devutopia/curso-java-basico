package com.kleber.javabasico.aula31;

class Carro {
	
	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	private double consCombustivel;
	
	public void exibirAutonomia() {

		System.out.println("A autonomia do carro �: " + (this.capCombustivel * this.consCombustivel) + " km.");
	}

	public double obterAutonomia() {

		System.out.println("M�todo obterAutonomia foi chamado.");

		return this.capCombustivel * this.consCombustivel;
	}
	
	private double divideKMPorConsumoCombust�vel(double km){
		
		return km / this.consCombustivel;
	}

	public double calculaCombustivel(double km) {

		return this.divideKMPorConsumoCombust�vel(km);
	}

}
