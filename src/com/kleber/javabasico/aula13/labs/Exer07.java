package com.kleber.javabasico.aula13.labs;

import java.util.Scanner;

public class Exer07 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		System.out.println("Informe o valor de um lado do quadrado: ");

		double lado = scan.nextDouble();

		double area = Math.pow(lado, 2);

		System.out.println("A área do quadrado é: " + area);

		System.out.println("O dobro da área do quadrado é: " + (area * 2));

		// ok

	}

}
