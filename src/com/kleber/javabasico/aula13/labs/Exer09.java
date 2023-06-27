package com.kleber.javabasico.aula13.labs;

import java.util.Scanner;

public class Exer09 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		System.out.println("Qual a temperatura em Farenheit no momento?");

		double tempFarenheit = scan.nextDouble();

		double tempCelsius;
		double tempCelsius2;

		tempCelsius = (tempFarenheit - 32) / 1.8;
		tempCelsius2 = (5 * (tempFarenheit - 32) / 9);

		System.out.println("A temperatura 1" + tempFarenheit +
				" F é igual a " + tempCelsius + " C.");
		System.out.println("A temperatura 2" + tempFarenheit +
				" F é igual a " + tempCelsius2 + " C.");

	}

}
