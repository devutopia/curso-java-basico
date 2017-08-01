package com.kleber.javabasico.aula13.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual a temperatura em Celsius no momento?");
		
		double tempCelsius = scan.nextDouble();
		
		double tempFahrenheit;
		
		tempFahrenheit = 1.8 * tempCelsius + 32;
		
		System.out.println("A temperatura " + tempCelsius + 
				" C é igual a " + tempFahrenheit + " F.");

	}

}
