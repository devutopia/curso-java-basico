package com.kleber.javabasico.aula13.labs;

import java.util.Scanner;

public class Exer12 {
	
	/* Tendo como dados de entrada a altura de uma pessoa, construa um
	algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
	(72.7*altura) - 58 */

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe sua altura: ");
		float altura = scan.nextFloat();
		
		float pesoIdeal = (72.7f * altura) - 58;
		
		System.out.println("Seu peso ideal é: " + pesoIdeal + "kg");
		
		//ok

	}

}
