package com.kleber.javabasico.aula17.labs;

import java.util.Scanner;

/*Faça um programa que peça 10 números inteiros, calcule e mostre a
quantidade de números pares e a quantidade de números impares*/

public class Exer14 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		int num;
		int pares = 0;
		int impares = 0;

		// iniciando com 1 o i para aproveitar o contador.
		for (int i = 1; i < 11; i++) {

			System.out.println("Entre com um número: " + i);
			num = scan.nextInt();

			if (num % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		System.out.println("Pares: " + pares);
		System.out.println("Ímpares: " + impares);
	}
}
