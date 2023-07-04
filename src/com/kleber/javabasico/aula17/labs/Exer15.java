package com.kleber.javabasico.aula17.labs;

/*A série de Fibonacci é formada pela sequencia
1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série
até o n_ésimo termo.*/

import java.util.Scanner;

public class Exer15 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		System.out.println("Entre com o n-ésimo termo da série de Fibonacci:");
		int n = scan.nextInt();

		int primeiro = 1;
		int segundo = 1;
		int proximo;

		System.out.println(primeiro);
		System.out.println(segundo);

		for (int i = 3; i <= n; i++) {

			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;

			System.out.println(proximo);
		}
	}
}
