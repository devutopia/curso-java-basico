package com.kleber.javabasico.aula17.labs;

/*Faça um programa que imprima na tela os números de 1 a 20, um
abaixo do outro. Depois modifique o programa para que ele mostre os
números um ao lado do outro.*/

public class Exer06 {

	public static void main(String[] args) {

		int cont = 1;

		/*
		 * Usando for, mais simples
		 * for (int i = 1; i <= 20; i++) {
		 * System.out.println(i);
		 * }
		 */

		// Usando while, precisa de váriavel externa e mais complicado.
		/*
		 * int cont = 1;
		 * while (cont <= 20) {
		 * System.out.println(cont + " ");
		 * cont++;
		 * }
		 */

		// Usando o do while, mais complicado ainda.
		do {
			System.out.println(cont);
			cont++;
		} while (cont <= 20);

		for (int i = 20; i >= 1; i--) {
			System.out.print(i + " ");
		}
	}
}
