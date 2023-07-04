package com.kleber.javabasico.aula17.labs;

/*Faça um programa que receba dois números inteiros e gere os
números inteiros que estão no intervalo compreendido por eles.*/

import java.util.Scanner;

public class Exer10 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		System.out.println("Entre com o primeiro número:");
		int num1 = scan.nextInt();

		System.out.println("Entre com o segundo número:");
		int num2 = scan.nextInt();

		if (num1 > num2) {
			for (int i = num1; i >= num2; i--) {
				System.out.println(i);
			}
		} else {
			for (int i = num1; i <= num2; i++) {
				System.out.println(i);
			}
		}
	}
}
