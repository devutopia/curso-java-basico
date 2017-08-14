package com.kleber.javabasico.aula17.labs;

/*Fa�a um programa que calcule o fatorial de um n�mero inteiro
fornecido pelo usu�rio. Ex.: 5!=5.4.3.2.1=120. A sa�da deve ser
conforme o exemplo abaixo:
- Fatorial de: 5
- 5! = 5 . 4 . 3 . 2 . 1 = 120*/

import java.util.Scanner;

public class Exer26 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		String output;
		
		System.out.println("Entre com um n�mero:");
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
