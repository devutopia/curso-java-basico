package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

/*Faça um Programa que peça dois números e imprima o maior deles*/

public class Exer01 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número.");
		int num1 = scan.nextInt();
		
		System.out.println("Informe o segundo número.");
		int num2 = scan.nextInt();
		
		if (num1 > num2){
			System.out.println("O maior número digitado foi: " + num1);
		} else {
			System.out.println("O maior número digitado foi: " + num2);
		}
		//ok
	}
}