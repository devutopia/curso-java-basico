package com.kleber.javabasico.aula27.labs;

public class Exer01 {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		lampada.tipoLuz = "branca";
		
		lampada.ligarLampada(true);
		
		lampada.ligarLampada(false);
	}

}
