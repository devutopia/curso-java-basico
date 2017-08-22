package com.kleber.javabasico.aula19.labs;

/**Criar um vetor A com 10 elementos inteiros. 
 * Desenvolver um programa que verifique se "todos" os elementos 
 * do vetor A s�o pares.
 * Se pelo menos um elemento do vetor n�o for par o processo de repeti��o para
 * percorrer os elementos do vetor deve ser encerrado, como sugest�o: 
 * utilize uma vari�vel do tipo flag para atingir este prop�sito.*/

import java.util.Scanner;

public class Exer23 {

	public static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i=0; i < vetorA.length; i++){
			
			System.out.println("Entre com um valor para o vetor A:");
			vetorA[i]  =scan.nextInt();
			
			if (vetorA[i] % 2 == 0){
				System.out.print(vetorA[i] + " ");
			} else {
				break;
			}
		}
	}
}
