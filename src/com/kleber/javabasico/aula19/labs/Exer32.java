package com.kleber.javabasico.aula19.labs;

/**Criar um vetor A com 5 elementos inteiros. Escreva um programa que
imprima a tabuada de cada um dos elementos do vetor A*/

import java.util.Scanner;

public class Exer32 {

	public static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		
		for (int i=0; i<vetorA.length; i++){
			System.out.println("Entre com o valor de A" + i);
			vetorA[i] = scan.nextInt();
		}
		
		for (int i=0; i<vetorA.length; i++){
			System.out.println("Tabuada de " + vetorA[i]);
			
			for (int j=1; j<=10; j++){
				System.out.println(vetorA[i] + " x " + j + " = " + (vetorA[i]*j));
			}
			System.out.println();
		}

	}
	
}
