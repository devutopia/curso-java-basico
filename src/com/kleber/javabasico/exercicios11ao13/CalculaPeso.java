package com.kleber.javabasico.exercicios11ao13;

import java.util.Scanner;

public class CalculaPeso {
	
	/*Tendo como dados de entrada a altura de uma pessoa, construa um
	algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
	(72.7*altura) - 58*/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua altura: ");
		
		float altura = scan.nextFloat();
		
		float pesoIdeal = (72.7f * altura) - 58;
		
		System.out.println("Seu peso ideal é: " + pesoIdeal + "kg");

	}

}
