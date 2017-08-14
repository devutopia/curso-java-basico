package com.kleber.javabasico.aula17.labs;

/*Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que
 * calcule o valor de H com N termos*/

import java.util.Scanner;

public class Exer34 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de n");
		int n = scan.nextInt();
		double soma = 0;
		
		for (double i=1; i<=n; i++){
			
			soma += 1/i;
		}
		
		System.out.println("Soma = " + soma);
	}

}
