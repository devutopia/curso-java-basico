package com.kleber.javabasico.exercicios11ao13;

import java.util.Scanner;

public class ConversaoCelsius {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual a temperatura em Celsius no momento?");
		
		double tempCelsius = scan.nextDouble();
		
		double tempFahrenheit;
		
		tempFahrenheit = 1.8 * tempCelsius + 32;
		
		System.out.println("A temperatura em graus Celsius é: " + tempFahrenheit);

	}

}
