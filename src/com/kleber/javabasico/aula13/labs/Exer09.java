package com.kleber.javabasico.aula13.labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual a temperatura em Farenheit no momento?");
		
		double tempFarenheit = scan.nextDouble();
		
		double tempCelsius;
		
		tempCelsius = (tempFarenheit - 32) / 1.8;
		
		System.out.println("A temperatura " + tempFarenheit + 
				" F é igual a " + tempCelsius + " C.");

	}

}
