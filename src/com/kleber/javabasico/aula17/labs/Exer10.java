package com.kleber.javabasico.aula17.labs;

/*Fa�a um programa que receba dois n�meros inteiros e gere os
n�meros inteiros que est�o no intervalo compreendido por eles.*/

import java.util.Scanner;

public class Exer10 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		
		System.out.println("Entre com o primeiro n�mero:");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo n�mero:");
		int num2 = scan.nextInt();
				
		for (int i=num1; i<=num2; i++){
			System.out.println(i);
		}
	}
}
