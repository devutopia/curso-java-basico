package com.kleber.javabasico.aula17.labs;

/*Faça um programa que calcule o fatorial de um número inteiro
fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120. A saída deve ser
conforme o exemplo abaixo:
- Fatorial de: 5
- 5! = 5 . 4 . 3 . 2 . 1 = 120*/

import java.util.Scanner;

public class Exer26 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		String output;
		
		System.out.println("Entre com um número:");
		int num = scan.nextInt();
		
		output = "Fatorial de: " + num + "\n";
		
		int fatorial = 1;
		
		output += num + "! = ";
		
		for(int i = num; i > 1 ; i--){
			fatorial *= i;
			output += i + " . ";
		}
		
		output += "1 = " + fatorial;
		System.out.println(output);
		

	}

}
