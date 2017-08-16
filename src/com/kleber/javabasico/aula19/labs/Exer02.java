package com.kleber.javabasico.aula19.labs;

/* Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
 * mesmo tipo e tamanho e com os elementos do vetor A multiplicados
 * por 2, ou seja: B[i] = A[i] * 2. */

public class Exer02 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[8];
		int[] vetorB = new int[8];
		
		vetorA[0]= 1;
		vetorA[1]= 2;
		vetorA[2]= 3;
		vetorA[3]= 4;
		vetorA[4]= 5;
		vetorA[5]= 6;
		vetorA[6]= 7;
		vetorA[7]= 8;
		
		for (int i = 0; i < vetorA.length; i++){
			vetorB[i] = vetorA[i] * 2;
			
			System.out.println("Vetor A " + vetorA[i]);
			System.out.println("Vetor B " + vetorB[i]);
		}
 
	}

}
