package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

/*Fa�a um Programa que pe�a um n�mero inteiro e determine se ele �
par ou impar. Dica: utilize o operador m�dulo (resto da divis�o).*/

public class Exer18 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Entre com n�mero:");
		int num = scan.nextInt();

		if (num % 2 == 0){
			System.out.println("N�mero par");
		} else{
			System.out.println("N�mero impar");
		}
		
	}

}
