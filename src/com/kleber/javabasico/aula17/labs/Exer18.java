package com.kleber.javabasico.aula17.labs;

/*Faça um programa que peça um número inteiro e determine se ele é
ou não um número primo. Um número primo é aquele que é divisível
somente por ele mesmo e por 1*/

import java.util.Scanner;

public class Exer18 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Entre com um número:");
		int num = scan.nextInt();
		
		boolean primo = true;
		
		for (int i=2; i<num; i++){
			if (num % i == 0){
				System.out.println("Não é número primo - divisível por " + i);
				primo = false;
			}
		}
		
		if (primo){
			System.out.println("É número primo.");
		}

	}

}
