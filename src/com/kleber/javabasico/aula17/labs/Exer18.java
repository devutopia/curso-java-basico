package com.kleber.javabasico.aula17.labs;

/*Fa�a um programa que pe�a um n�mero inteiro e determine se ele �
ou n�o um n�mero primo. Um n�mero primo � aquele que � divis�vel
somente por ele mesmo e por 1*/

import java.util.Scanner;

public class Exer18 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero:");
		int num = scan.nextInt();
		
		boolean primo = true;
		
		for (int i=2; i<num; i++){
			if (num % i == 0){
				System.out.println("N�o � n�mero primo - divis�vel por " + i);
				primo = false;
			}
		}
		
		if (primo){
			System.out.println("� n�mero primo.");
		}

	}

}
