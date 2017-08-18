package com.kleber.javabasico.aula19.labs;

/**Criar um vetor A com 10 elementos inteiros. 
 * Desenvolver um programa que defina o percentual 
 * de elementos pares e ímpares, respectivamente, armazenados neste vetor.*/

import java.util.Scanner;

public class Exer15 {

public static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		int pares = 0;
		
		for (int i = 0; i < vetorA.length; i++){
			
			System.out.println("Entre com o valor da posição " + i);
			vetorA[i] = scan.nextInt();
			
			if (vetorA[i] % 2 ==0){
				pares++;
			}
		}
		
		//vetorA.lenght - 100%
		//par           - X
		//= x.vetorA.length = par * 100
		//= x == (par *100)/vetorA.length
		
		double porcPar = (pares * 100)/vetorA.length;
		double porcImpar = 100 - porcPar;
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Percentual de números pares = " + porcPar + "%");
		System.out.println("Percentual de números ímpares = " + porcImpar + "%");

	}

}
