package com.kleber.javabasico.aula17.labs;

import java.util.Scanner;

/*Fa�a um programa que pe�a uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inv�lido e continue pedindo at� que o
usu�rio informe um valor v�lido.*/

public class Exer01 {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		boolean notaValida = false;
		
		do{
			
			System.out.println("Digite uma nota (0 - 10):");
			
			double nota = scan.nextDouble();
			
			if (nota >=0 && nota <= 10){
				notaValida = true;
				System.out.println("Nota digitada: " + nota);
			} else {
				System.out.println("Nota inv�lida, digite novamente.");
			}
			
		} while (!notaValida);
		
	}
}
