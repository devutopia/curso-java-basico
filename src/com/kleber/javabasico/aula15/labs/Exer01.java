package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

/*Fa�a um Programa que pe�a dois n�meros e imprima o maior deles*/

public class Exer01 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero.");
		int num1 = scan.nextInt();
		
		System.out.println("Informe o segundo n�mero.");
		int num2 = scan.nextInt();
		
		if (num1 > num2){
			System.out.println("O maior n�mero digitado foi: " + num1);
		} else {
			System.out.println("O maior n�mero digitado foi: " + num2);
		}

	}
}
