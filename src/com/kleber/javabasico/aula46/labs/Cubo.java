package com.kleber.javabasico.aula46.labs;

public class Cubo extends Figura3D{
	
	private final double FACES = 6;
	
	private double lado;
	
	public Cubo() {
		super.setNome("Cubo");
	}
	
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
		//A=6*l2
		return FACES * (lado * lado);
	}

	@Override
	public double calcularVolume() {
		//V = a3;
		return Math.pow(lado, 3);
	}


}
