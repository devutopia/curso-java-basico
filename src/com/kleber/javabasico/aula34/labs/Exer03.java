package com.kleber.javabasico.aula34.labs;

import java.util.Scanner;

public class Exer03 {
	
	private static Scanner scan;
	
	public static void main (String[] args){
		
		scan = new Scanner(System.in);
		
		int num;
		
		do {
			
			System.out.println("Entre com um n�mero positivo");
			num= scan.nextInt();
			
			if (num <0){
				System.out.println("N�mero inv�lido, entre novamente.");
			}
		}while (num <0);
		
		System.out.println(Calculadora.fatorial(num));
	}

}
