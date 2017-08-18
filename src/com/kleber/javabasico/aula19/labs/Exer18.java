package com.kleber.javabasico.aula19.labs;

/**Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas. 
 * Escreva um programa que determine e escreva a menor e a maior idades e suas respectivas posições.*/

import java.util.Scanner;

public class Exer18 {

public static Scanner scan;
	
	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		int[] idades = new int[10];
		
		for (int i = 0; i < idades.length; i++){
			System.out.println("Digite a idade: " + (i+1));
			idades[i] = scan.nextInt();
			
			
		}
		
		int menorIdade = idades[0];
		int indexMenor = 0;
		int maiorIdade = idades[0];
		int indexMaior = 0;
		
		for (int i = 0; i < idades.length; i++){
			if (idades[i] > maiorIdade){
				maiorIdade = idades[i];
				indexMaior = i;
			} else if (idades[i] < menorIdade){
				menorIdade = idades[i];
				indexMenor = i;
			}
		}
			
		System.out.print("Vetor de idades = ");
		for (int i = 0; i < idades.length; i++){
			System.out.print(idades[i] + " ");
		}
		System.out.println();
		
		System.out.println("Menor idade: " + menorIdade);
		System.out.println("Índice menor idade: " + indexMenor);
		System.out.println("Maior idade: " + maiorIdade);
		System.out.println("Índice maior idade: " + indexMaior);
	}
}
