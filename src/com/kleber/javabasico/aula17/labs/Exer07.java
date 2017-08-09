package com.kleber.javabasico.aula17.labs;

//Fa�a um programa que leia 5 n�meros e informe o maior n�mero.

import java.util.Scanner;

public class Exer07 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int num;
		int maior = Integer.MIN_VALUE;
		
		for(int i = 0; i < 5; i++){
			System.out.println("Entre com um n�mero:");
			num = scan.nextInt();
			
			if(num > maior){
				maior = num;
			}
		}
		System.out.println("O maior n�mero digitado foi: " + maior);
	}
}
