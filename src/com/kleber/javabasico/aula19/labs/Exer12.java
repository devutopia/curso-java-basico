package com.kleber.javabasico.aula19.labs;

import java.util.Scanner;

/**Criar um vetor A com 10 elementos inteiros. 
 * Implementar um programa que defina e escreva 
 * a soma de todos os elementos armazenados neste vetor.*/

public class Exer12 {

	public static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++){
			
			System.out.println("Entre com o valor da posição " + i);
			vetorA[i] = scan.nextInt();
		}
		
		int soma = 0;
		
		for(int i = 0; i < vetorA.length; i++){
			
			soma += vetorA[i];
		}
		
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
		System.out.println();
		
		System.out.println("Soma dos elementos do vetor A: " + soma);
	}

}
