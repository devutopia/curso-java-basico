package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

/*Fa�a um Programa que leia um n�mero e exiba o dia correspondente
da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
aparecer valor inv�lido.*/

public class Exer13 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana (1 - 7):");
		int diaDaSemana = scan.nextInt();
		
		switch (diaDaSemana) {
		case 1: System.out.println("Domingo");
			break;
		case 2: System.out.println("Segunda");
			break;
		case 3: System.out.println("Ter�a");
			break;
		case 4: System.out.println("Quarta");
			break;
		case 5: System.out.println("Quinta");
			break;
		case 6: System.out.println("Sexta");
			break;
		case 7: System.out.println("S�bado");
			break;
		default: System.out.println("Valor inv�lido");
			break;
		}
	}
}
