package com.kleber.javabasico.exercicios11ao13;

import java.util.Scanner;

public class ConversaoFahrenheit {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual a temperatura em Farenheit no momento?");
		
		double tempFarenheit = scan.nextDouble();
		
		double tempCelsius;
		
		tempCelsius = (tempFarenheit - 32) / 1.8;
		
		System.out.println("A temperatura em graus Celsius é: " + tempCelsius);

	}

}
