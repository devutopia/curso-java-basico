package com.kleber.javabasico.aula17.labs;

import java.util.Scanner;

/*Faça um programa que peça dois números, base e expoente, calcule e
mostre o primeiro número elevado ao segundo número. Não utilize a
função de potência da linguagem.*/

public class Exer13 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		System.out.println("Informe o número base: ");
		int base = scan.nextInt();

		System.out.println("Informe potência: ");
		int expoente = scan.nextInt();

		int cont = 1;
		int resultado = base;

		while (cont < expoente) {
			resultado *= base;
			cont++;
		}

		System.out.println("Resultado com 'while': " + resultado);

		resultado = base;

		for (int i = 1; i < expoente; i++) {
			resultado *= base;
		}

		System.out.println("Resultado com 'for': " + resultado);
	}

}
