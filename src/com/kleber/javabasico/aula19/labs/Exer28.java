package com.kleber.javabasico.aula19.labs;

/**Ler um vetor A com 10 elementos e construir um vetor B de mesmo tipo e 
 * tamanho e com os mesmos elementos de A, sendo que estes dever�o estar 
 * invertidos, ou seja, o primeiro elemento de A passa a ser o �ltimo de B, 
 * o segundo elemento de A passa a ser o pen�ltimo de B e assim por diante*/

import java.util.Scanner;

public class Exer28 {

	public static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for (int i=0; i < vetorA.length; i++){
			System.out.println("Entre com o valor de A" + i);
			vetorA[i] = scan.nextInt();
			
			vetorB[vetorA.length - i - 1] = vetorA[i];
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
