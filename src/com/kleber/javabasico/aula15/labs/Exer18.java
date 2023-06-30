package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

/*Faça um Programa que peça um número inteiro e determine se ele é
par ou impar. Dica: utilize o operador módulo (resto da divisão).*/

public class Exer18 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		System.out.println("Entre com número:");
		int num = scan.nextInt();

		if (num % 2 == 0) {
			System.out.println("número par");
		} else {
			System.out.println("número impar");
		}
	}
}
