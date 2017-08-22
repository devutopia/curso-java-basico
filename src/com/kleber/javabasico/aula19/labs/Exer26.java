package com.kleber.javabasico.aula19.labs;

/**Criar dois vetores A e B cada um com 10 elementos inteiros.
 * Construir um vetor C de mesmo tipo e tamanho, obedecendo as seguintes regras de forma��o:
 * a) C[i] dever� receber 1 quando A[i] for maior que B[i];
 * b) C[i] dever� receber 0 quando A[i] for igual a B[i];
 * c) C[i] dever� receber -1 quando A[i] for menor que B[i]*/

import java.util.Scanner;

public class Exer26 {

	public static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for(int i=0; i < vetorA.length; i++){
			System.out.println("Entre com o valor de A" + i);
			vetorA[i] = scan.nextInt();
		}
		
		for(int i=0; i < vetorB.length; i++){
			System.out.println("Entre com o valor de B" + i);
			vetorB[i] = scan.nextInt();
		}
		
		for(int i=0; i < vetorC.length; i++){
			if (vetorA[i] > vetorB[i]){
				vetorC[i] = 1;
			} else if (vetorA[i] == vetorB[i]){
				vetorC[i] = 0;
			} else if (vetorA[i] < vetorB[i]){
				vetorC[i] = -1;
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
		System.out.println();
		
		System.out.print("Vetor C = ");
		for(int i=0; i<vetorC.length; i++){
			System.out.print(vetorC[i] + " ");
		}
		
	}

}
