package com.kleber.javabasico.aula19.labs;

/**Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas. 
 * Escreva um programa que determine e escreva a quantidade de pessoas que possuem idade 
 * superior a 35 anos.*/

import java.util.Scanner;

public class Exer17 {

public static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int qtdIdade = 0;
		
		for (int i = 0; i < vetorA.length; i++){
			System.out.println("Digite a idade: " + (i+1));
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i] > 35){
				qtdIdade++;
			}
		}
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Quantidade pessoas com idade maior que 35 anos " + qtdIdade);
	}
}
