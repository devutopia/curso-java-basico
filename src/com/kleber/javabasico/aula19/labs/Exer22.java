package com.kleber.javabasico.aula19.labs;

/**Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a 0 e 1,
 * sugest�o: A[i] = (int)Math.round(Math.random() * 1); 
 * Pede-se para implementar um programa que determine o 
 * percentual de n�meros 0's e 1's existentes no vetor A.*/

public class Exer22 {
	
	public static void main(String[] args) {
		
		int[] vetorA = new int[10];
		int qtd0 = 0;
		int qtd1 = 0;
		
		for (int i=0; i<vetorA.length; i++){
			vetorA[i] = (int) Math.round(Math.random() * 1);
			
			if (vetorA[i] == 0){
				qtd0++;
			} else {
				qtd1++;
			}
		}
		
		//10 - 100%
		//qtd - x
		//x = (qtd * 100)/10;
		
		double porc0 = (qtd0 * 100) / vetorA.length;
		double porc1 = (qtd1 * 100) / vetorA.length;
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Percentual de 0 = " + porc0 + "%");
		System.out.println("Percentual de 1 = " + porc1 + "%");
	}
}
