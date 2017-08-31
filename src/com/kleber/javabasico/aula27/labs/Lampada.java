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
	boolean estadoLampada;
	
	// Método criado por mim em um único bloco.
	
	/*void ligarLampada (boolean ligarLampada){
		
		estadoLampada = ligarLampada;
		
		if (!estadoLampada){
			estadoLampada = false;
			System.out.println("Lampada desligada");
		} else {
			System.out.println("Lampada ligada");
		}
	}*/
	
	//Métodos da correção.
	
	void ligar(){
		estadoLampada = true;
	}
	
	void desligar(){
		estadoLampada = false;
	}
	
	void mostrarEstado(){
		if (estadoLampada){
			System.out.println("Lâmpada está ligada");
		} else {
			System.out.println("Lâmpada está desligada");
		}
	}
	
	void mudarEstado(){
		if(estadoLampada){
			desligar();
		} else {
			ligar();
		}
	}
	
	
}
