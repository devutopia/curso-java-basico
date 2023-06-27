package com.kleber.javabasico.aula13.labs;

import java.util.Scanner;

public class Exer09 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		System.out.println("Qual a temperatura em Farenheit no momento?");

		double tempFarenheit = scan.nextDouble();

		double c;

		c = (5 * (tempFarenheit - 32) / 9);

		System.out.println("A temperatura 1" + tempFarenheit +
				" F é igual a " + c + " C.");
	}

}
