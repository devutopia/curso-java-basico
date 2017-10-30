package com.kleber.javabasico.aula46.labs;

public class Quadrado extends Figura2D{

	private double lado;
	
	public Quadrado() {
		super.setNome("Quadrado");	}
	
	/**
	 * @return the lado
	 */
	public double getLado() {
		return lado;
	}

	/**
	 * @param lado the lado to set
	 */
	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return (lado * lado);
	}
}
