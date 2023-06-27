package com.kleber.javabasico.aula13.labs;

import java.util.Scanner;

public class Exer06 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		System.out.print("Informe o valor do raio do circulo: ");

		double raio = scan.nextDouble();
		double area = Math.PI * (raio * raio);

		System.out.println("Área do círculo: " + area);

		// ok
	}

}
