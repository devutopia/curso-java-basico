package com.kleber.javabasico.aula46.labs;

public class Cilindro extends Figura3D  {
	
	private double raio;
	private double altura;
	
	/**
	 * @return the raio
	 */
	public double getRaio() {
		return raio;
	}

	/**
	 * @param raio the raio to set
	 */
	public void setRaio(double raio) {
		this.raio = raio;
	}

	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		/*
		//Ab = 2*πr2 - cálculo da base
		double areaBase = 2 * (Math.PI*(Math.pow(raio, 2)));
		
		//Al = 2*πr·h - calculo da lateral
		double areaLateral = 2 * (Math.PI*(raio*altura));
		
		//A = Ab + Al - calculo Total
		double areaTotal = areaBase + areaLateral;
		*/
		
		//ou ainda, 2*π*r*(r + h) - calculo Total
		double areaTotal = 2 * (Math.PI*raio*(raio+altura));
		
		return areaTotal;
	}

	@Override
	public double calcularVolume() {
		
		//V = π·r2·h
		return Math.PI*(Math.pow(raio, 2)*altura);
	}

	

}
