package com.kleber.javabasico.aula13.labs;

import java.util.Scanner;

public class Exer03 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");

		int firstNumber = scan.nextInt();

		System.out.print("Digite o segundo número: ");

		int secondNumber = scan.nextInt();

		int result = firstNumber + secondNumber;

		System.out.println("A soma dos números digitados é:" + result);

		// ok

	}

}
