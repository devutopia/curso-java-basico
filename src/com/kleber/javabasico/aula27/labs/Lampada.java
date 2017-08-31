package com.kleber.javabasico.aula27.labs;

/*Escreva uma classe para representar uma l�mpada. 
 * Desenvolva m�todos para ligar, desligar a lampada.*/

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
	
	// M�todo criado por mim em um �nico bloco.
	
	/*void ligarLampada (boolean ligarLampada){
		
		estadoLampada = ligarLampada;
		
		if (!estadoLampada){
			estadoLampada = false;
			System.out.println("Lampada desligada");
		} else {
			System.out.println("Lampada ligada");
		}
	}*/
	
	//M�todos da corre��o.
	
	void ligar(){
		estadoLampada = true;
	}
	
	void desligar(){
		estadoLampada = false;
	}
	
	void mostrarEstado(){
		if (estadoLampada){
			System.out.println("L�mpada est� ligada");
		} else {
			System.out.println("L�mpada est� desligada");
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
