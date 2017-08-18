package com.kleber.javabasico.aula19.labs;

/**Criar um vetor A com 10 elementos inteiros. 
 * Escrever um programa que calcule e escreva: 
 * a) a soma de elementos armazenados neste vetor que são inferiores a 15; 
 * b) a quantidade de elementos armazenados no vetor que são iguais a 15; 
 * c) a média dos elementos armazenados no vetor que são superiores a 15*/

import java.util.Scanner;

public class Exer16 {

public static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		int somaMenor= 0;
		int qtdIgual= 0;
		int somaMaior = 0;
		int qtdMaior = 0;
		
		for (int i = 0; i < vetorA.length; i++){
			System.out.println("Entre com o valor da posição " + i);
			vetorA[i] = scan.nextInt();
			
			if (vetorA[i] < 15){
				somaMenor += vetorA[i];
			} else if (vetorA[i] == 15){
				qtdIgual++;
			} else if (vetorA[i] > 15){
				somaMaior += vetorA[i];
				qtdMaior++;
			}
		}
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.println("Soma dos elementos < que 15    : " + somaMenor);
		System.out.println("Quantidade de elementos = a 15 : " + qtdIgual);
		System.out.println("Média dos elementos > que 15   : " + (somaMaior/qtdMaior));
	}
}
