package com.kleber.javabasico.aula19.labs;

/**Criar um vetor A com 10 elementos inteiros. 
 * Construir um vetor B de mesmo tipo e tamanho, obedecendo as seguintes regras de forma��o:
 * a) B[i] dever� receber 1 quando A[i] for par; 
 * b) B[i] dever� receber 0 quando A[i] for �mpar*/

import java.util.Scanner;

public class Exer25 {
	
	public static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for (int i=0; i < vetorA.length; i++){
			System.out.println("Entre com o valor da posi��o " + i);
			vetorA[i] = scan.nextInt();
			
			/*if (vetorA[i] % 2 ==0){
				vetorB[i] = 1;
			} else {
				vetorB[i] = 0;
			}*/
			
			//Utilizando operador tern�rio
			
			vetorB[i] = (vetorA[i] % 2 ==0) ? 1 : 0;
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