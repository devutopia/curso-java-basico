package com.kleber.javabasico.aula33.labs;

public class Exer01 {

	public static void main(String[] args) {
		
		Lampada lamp = new Lampada();
		
		lamp.setModelo("Fluorescente");
		System.out.println(lamp.getModelo());
		
		lamp.desligar();
		
		lamp.setEstadoLampada(true);
		
		lamp.mostrarEstado();

	}

}
