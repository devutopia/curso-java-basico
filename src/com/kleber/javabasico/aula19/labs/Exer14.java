package com.kleber.javabasico.aula19.labs;

/**Criar um vetor A com 10 elementos inteiros.
 * Implementar um programa que defina e escreva 
 * a média aritmética simples dos elementos ímpares 
 * armazenados neste vetor*/

import java.util.Scanner;

public class Exer14 {

public static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++){
			
			System.out.println("Entre com o valor da posição " + i);
			vetorA[i] = scan.nextInt();
		}
		
		int soma = 0;
		int qtdImpar = 0;
		for (int i = 0; i < vetorA.length; i++){
			if (vetorA[i] % 2 != 0){
				soma += vetorA[i];
				qtdImpar++;
			}
		}
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + (soma/qtdImpar));
	}
}
