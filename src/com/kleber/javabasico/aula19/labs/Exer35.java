package com.kleber.javabasico.aula19.labs;

/**Criar um vetor A com 10 elementos inteiros. 
 * Escreva um programa que imprima cada elemento do vetor A 
 * e a rela��o de todos os divisores do respectivo elemento*/

import java.util.Scanner;

public class Exer35 {

	public static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];

		for(int i=0; i<vetorA.length; i++){

			System.out.println("Digite o valor da posi��o " + i);
			vetorA[i] = scan.nextInt();
		}

		for(int i=0; i<vetorA.length; i++){

			System.out.println("Analisando o n�mero " + vetorA[i]);

			for (int j=1; j <= vetorA[i]; j++){
				if (vetorA[i] % j == 0){
					System.out.println(j + " � divisor");
				}
			}
			System.out.println();
		}

	}
}
