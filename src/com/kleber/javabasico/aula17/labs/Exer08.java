package com.kleber.javabasico.aula17.labs;

/*Fa�a um programa que leia 5 n�meros e informe a soma e a m�dia
dos n�meros.*/

import java.util.Scanner;

public class Exer08 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int num;
		int soma = 0;
		double media;
		
		for(int i = 0; i<5; i++){
			System.out.println("Digite um n�mero: ");
			num = scan.nextInt();
			
			soma += num;
		}
		
		media = soma / 5;
		
		System.out.println("Soma: " + soma);
		System.out.println("M�dia: " + media);
	}
}
