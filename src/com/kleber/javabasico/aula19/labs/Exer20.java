package com.kleber.javabasico.aula19.labs;

/**Implementar um programa que obtenha a cota��o do d�lar (U$) em rela��o ao real (R$) 
 * e a seguir armazene em vetor A com 20 elementos as seguintes convers�es:*/

import java.util.Scanner;

public class Exer20 {
	
	public static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		double[] vetorA = new double[20];
		double cotacao;
		
		System.out.println("Entre com a cota��o do d�lar:");
		cotacao = scan.nextDouble();
		
		for (int i=0; i< vetorA.length; i ++){
			vetorA[i] = cotacao * (i+1);
		}
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

	}

}
