package com.kleber.javabasico.aula19.labs;

/**Criar um vetor A com 10 elementos inteiros. 
 * Construir um vetor B de mesmo tipo e tamanho, obedecendo as seguintes regras de forma��o:
 * a) B[i] dever� receber 'a' quando A[i] for menor que 7;
 * b) B[i] dever� receber 'b' quando A[i] for igual a 7; 
 * c) B[i] dever� receber 'c' quando A[i] for maior que 7 e menor que 10; 
 * d) B[i] dever� receber 'd' quando A[i] for igual a 10;
 * e) B[i] dever� receber 'e' quando A[i] for maior que 10.
 * Sugest�o: char B[10]*/

import java.util.Scanner;

public class Exer27 {

	public static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		 
		int[] vetorA = new int[10];
		char[] vetorB = new char[vetorA.length];
		
		for(int i=0; i < vetorA.length; i++){
			System.out.println("Entre com o valor de A" + i);
			vetorA[i] = scan.nextInt();
		}
		
		for(int i=0; i < vetorB.length; i++){
			if (vetorA[i] < 7){
				vetorB[i] = 'a';
			} else if (vetorA[i] == 7){
				vetorB[i] = 'b';
			} else if (vetorA[i] > 7 && vetorA[i] < 10){
				vetorB[i] = 'c';
			} else if (vetorA[i] == 10){
				vetorB[i] = 'd';
			} else if (vetorA[i] > 10){
				vetorB[i] = 'e';
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
