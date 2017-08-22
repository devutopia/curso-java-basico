package com.kleber.javabasico.aula19.labs;

/**Números palíndromos são aqueles que escritos da direita para a esquerda têm o mesmo valor 
 * quando escritos da esquerda para a direita. Exemplo: 545; 789987; 97379; 123454321; etc. 
 * Escreva um programa que verifique se um dado vetor A de 10 elementos inteiros é um palíndromo, 
 * ou seja, se o primeiro elemento do vetor e igual ao último, se o segundo elemento do vetor 
 * é igual ao penúltimo e assim por diante até verificar todos os elementos ou chegar a conclusão que 
 * o vetor não é um palíndromo.*/

import java.util.Scanner;

public class Exer24 {
	
	public static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i=0; i < vetorA.length; i++){
			
			System.out.println("Entre com o valor de A" + i);
			vetorA[i] = scan.nextInt();
			
		}
		
		boolean palindromo = true;
		for (int i=0; i<vetorA.length / 2; i++){
			
			if(vetorA[i] != vetorA[vetorA.length - 1 -i]){
				palindromo = false;
				break;
			}
		}
		
		System.out.print("Vetor A = ");
		for(int i=0; i<vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		if (palindromo){
			System.out.println("Palíndromo");
		} else {
			System.out.println("Não é Palíndromo");
		}
		

	}


}
