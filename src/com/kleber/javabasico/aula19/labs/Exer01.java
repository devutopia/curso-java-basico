package com.kleber.javabasico.aula19.labs;

/*Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo 
 * e tamanho e com os "mesmos" elementos do vetor A, ou seja, B[i] = A[i]*/

public class Exer01 {

	public static void main(String[] args) {
		
		double[] vetorA = new double[5];
		double[] vetorB = new double[5];

		
		for (int i = 0, j=0; i < vetorA.length; i++){
			vetorB[j] = vetorA[i];
			
			System.out.println("Vetor A" + vetorA[i]);
			System.out.println("Vetor A" + vetorA[i]);
		}
	}

}
