package com.kleber.javabasico.aula13.labs;

import java.util.Scanner;

public class Exer02 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");

		int numDigitado = scan.nextInt();

		System.out.println("O número digitado foi: " + numDigitado);
	}

}
