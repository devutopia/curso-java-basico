package com.kleber.javabasico.aula46.labs;

public class Circulo extends Figura2D {
	
	//A= PI.r.r
	
	private double raio;
	
	public Circulo() {
		super.setNome("Circulo");
	}
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
	 * @return the area
	 */
	
	@Override
	public double calcularArea() {
		return (raio * raio) * Math.PI;
	}
}
