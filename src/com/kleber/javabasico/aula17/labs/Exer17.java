package com.kleber.javabasico.aula17.labs;

import java.util.Scanner;

/*Fa�a um programa que calcule o fatorial de um n�mero inteiro
fornecido pelo usu�rio. Ex.: 5!=5.4.3.2.1=120*/

public class Exer17 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero:");
		int num = scan.nextInt();
		
		System.out.println(num + " ! = ");
		
		int fatorial = 1;
		
		for(int i = num; i > 0 ; i--){
			fatorial *= i;
			System.out.println(i);
		}
		
		System.out.println("Resultado: " + fatorial);
		

	}

}
