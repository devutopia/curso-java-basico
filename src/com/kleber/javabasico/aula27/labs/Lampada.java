package com.kleber.javabasico.aula27.labs;

/*Escreva uma classe para representar uma lâmpada. 
 * Desenvolva métodos para ligar, desligar a lampada.*/

public class Lampada {
	
		
	String modelo;
	String tipoLuz;
	String tensao;
	int potencia;
	int quantidade;
	int garantiaMeses;
	String tipos[];
	double preco;
	
	void ligarLampada (boolean ligarLampada){
		
		boolean estadoLampada = ligarLampada;
		
		if (!estadoLampada){
			estadoLampada = false;
			System.out.println("Lampada desligada");
		} else {
			System.out.println("Lampada ligada");
		}
	}
}
