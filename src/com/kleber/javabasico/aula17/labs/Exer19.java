package com.kleber.javabasico.aula17.labs;

import java.util.Scanner;

/*Fa�a um programa que calcule o mostre a m�dia aritm�tica de N
notas.*/

public class Exer19 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Entre o n�meros de notas:");
		int notas = scan.nextInt();
		double soma = 0;
		double media;
		double nota;
		
		for (int i=0; i<notas; i++){
			System.out.println("Entre com a nota " + (i+1));
			nota = scan.nextDouble();
			
			soma += nota;
		}
		
		media = soma / notas;
		
		System.out.println("M�dia das notas = " + media);
		

	}

}
