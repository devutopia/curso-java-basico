package com.kleber.javabasico.aula19.labs;

/**Ler dois vetores A e B com 10 elementos cada.
 * Construir um vetor C, sendo este a junção dos dois outros vetores.
 * Os primeiros 10 elementos de C deverão receber os elementos de A 
 * e os últimos elementos C deverão receber os elementos de B.
 * Desta forma, C deverá ter o dobro de elementos de A e B, ou seja, 20 elementos*/

import java.util.Scanner;

public class Exer29 {
	
	public static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length * 2];
		
		for(int i=0; i < vetorA.length; i++){
			System.out.println("Entre com o valor de A" + i);
			vetorA[i] = scan.nextInt();
			
			vetorC[i] = vetorA[i];
		}
		
		for(int i=0; i < vetorB.length; i++){
			System.out.println("Entre com o valor de B" + i);
			vetorB[i] = scan.nextInt();
			
			vetorC[vetorA.length + i] = vetorB[i];
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
		System.out.println();
		
		System.out.print("Vetor C = ");
		for(int i=0; i<vetorC.length; i++){
			System.out.print(vetorC[i] + " ");
		}
	}
}
