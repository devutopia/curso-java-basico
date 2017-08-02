package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

/*Faça um Programa que peça um valor e mostre na tela se o valor é
positivo ou negativo.*/

public class Exer02 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		System.out.println("Informe um número.");
		int numero = scan.nextInt();
		
		if (numero > 0){
			System.out.println("Você digitou um número positivo");
		} else if (numero < 0){
			System.out.println("Você digitou um número negativo");
		} else {
			System.out.println("Você digitou um número neutro");
		}
	}
}
