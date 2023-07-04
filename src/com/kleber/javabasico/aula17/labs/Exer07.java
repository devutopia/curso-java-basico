package com.kleber.javabasico.aula17.labs;

//Faça um programa que leia 5 números e informe o maior número.

import java.util.Scanner;

public class Exer07 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		int num;
		int maior = Integer.MIN_VALUE;

		for (int i = 0; i < 5; i++) {
			System.out.println("Entre com um número:");
			num = scan.nextInt();
			if (num > maior) {
				maior = num;
				// System.out.println("O maior agora é: " + maior);
			}
		}
		System.out.println("O maior numero digitado foi: " + maior);
	}
}
