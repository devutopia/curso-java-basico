package com.kleber.javabasico.aula19.labs;

/**Criar um vetor A com 10 elementos inteiros.
 * Escreva um programa que imprima cada elemento do vetor A e a 
 * relação de todos os pares de 0 até o respectivo elemento*/

import java.util.Scanner;

public class Exer34 {

	public static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		for(int i=0; i<vetorA.length; i++){

			System.out.println("Digite o valor da posição " + i);
			vetorA[i] = scan.nextInt();
		}

		for(int i=0; i<vetorA.length; i++){

			System.out.println("Analisando o número " + vetorA[i]);

			for (int j=2; j < vetorA[i]; j++){
				if (j % 2 == 0){
					System.out.println(j + " é par");
				}
			}
			System.out.println();
		}
	}
}
