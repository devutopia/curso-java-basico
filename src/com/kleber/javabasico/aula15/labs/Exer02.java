package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

/*Fa�a um Programa que pe�a um valor e mostre na tela se o valor �
positivo ou negativo.*/

public class Exer02 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		System.out.println("Informe um n�mero.");
		int numero = scan.nextInt();
		
		if (numero > 0){
			System.out.println("Voc� digitou um n�mero positivo");
		} else if (numero < 0){
			System.out.println("Voc� digitou um n�mero negativo");
		} else {
			System.out.println("Voc� digitou um n�mero neutro");
		}
	}
}
