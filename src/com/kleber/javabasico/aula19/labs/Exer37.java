package com.kleber.javabasico.aula19.labs;

/**Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tamanho, sendo que cada elemento do vetor B seja o fatorial
do elemento correspondente em A*/

import java.util.Scanner;

public class Exer37 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++){

			System.out.println("Digite o valor da posição " + i);
			vetorA[i] = scan.nextInt();
		}
		
		for(int i=0; i<vetorA.length; i++){
			
			vetorB[i] = 1;
			for(int j=1; j <= vetorA[i]; j++){
				vetorB[i] *= j;
			}
			
		}
		
		System.out.print("Vetor A = ");
		for(int i=0; i<vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for(int i=0; i<vetorB.length; i++){
			System.out.print(vetorB[i] + " ");
		}

	}

}
