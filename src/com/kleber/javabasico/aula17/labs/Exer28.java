package com.kleber.javabasico.aula17.labs;

import java.util.Scanner;

/*Os números primos possuem várias aplicações dentro da Computação, 
 * por exemplo na Criptografia. Um número primo é aquele que é 
 * divisível apenas por um e por ele mesmo. Faça um programa que peça 
 * um número inteiro e determine se ele é ou não um número primo.*/

public class Exer28 {

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
