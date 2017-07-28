package com.kleber.javabasico.exercicios11ao13;

import java.util.Scanner;

public class ConversaoFarenheit {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual a temperatura em Farenheit no momento?");
		
		double tempFarenheit = scan.nextDouble();
		
		double tempCelsius;
		
		tempCelsius = 5 * (tempFarenheit - 32) / 9;
		
		System.out.println("A temperatura em graus Celsius é: " + tempCelsius);

	}

}
