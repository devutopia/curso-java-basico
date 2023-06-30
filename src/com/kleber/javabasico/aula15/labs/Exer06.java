package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

//Faça um Programa que leia três números e mostre o maior deles.

public class Exer06 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe 3 números no seguinte formato n1 n2 n3");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();
		
		if(num1 > num2 && num1 > num3){
			System.out.println("O primeiro número digitado, " + num1 + " é o maior.");
		} else if(num2 > num1 && num2 > num3){
			System.out.println("O segundo número digitado, " + num2 + " é o maior.");
		} else {
			System.out.println("O terceiro número digitado, " + num3 + " é o maior.");
		}
	}
	//ok
}
