package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

/*Faça um Programa que leia três números e mostre o maior e o menor
deles.*/

public class Exer07 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		System.out.println("Informe 3 números no seguinte formato n1 n2 n3");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();
		/*
		 * Pior método
		 * 
		 * double menor;
		 * double maior;
		 * 
		 * if(num1 > num2){
		 * maior = num1;
		 * menor = num2;
		 * } else {
		 * maior = num2;
		 * menor = num1;
		 * }
		 * if(maior < num3){
		 * maior = num3;
		 * }
		 * if(menor > num3){
		 * menor = num3;
		 * }
		 * System.out.println("O maior valor é " + maior + " o menor valor é " + menor);
		 */

		// Método mais eficaz

		if (num1 >= num2 && num1 >= num3) {
			System.out.println("O primeiro número digitado, " + num1 + " é o maior.");
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("O segundo número digitado, " + num2 + " é o maior.");
		} else {
			System.out.println("O terceiro número digitado, " + num3 + " é o maior.");
		}

		if (num1 <= num2 && num1 <= num3) {
			System.out.println("O primeiro número digitado, " + num1 + " é o menor.");
		} else if (num2 <= num1 && num2 <= num3) {
			System.out.println("O segundo número digitado, " + num2 + " é o menor.");
		} else {
			System.out.println("O terceiro número digitado, " + num3 + " é o menor.");
		}
		// ok
	}
}
