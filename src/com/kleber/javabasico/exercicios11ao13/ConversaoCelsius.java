package com.kleber.javabasico.exercicios11ao13;

import java.util.Scanner;

public class ConversaoCelsius {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual a temperatura em Celsius no momento?");
		
		double tempCelsius = scan.nextDouble();
		
		double tempFarenheit;
		
		tempCelsius = 5 * (tempFarenheit - 32) / 9;
		
		System.out.println("A temperatura em graus Celsius é: " + tempCelsius);

	}

}
