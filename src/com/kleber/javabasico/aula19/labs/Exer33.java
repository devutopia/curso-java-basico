package com.kleber.javabasico.aula19.labs;

/**Criar um vetor A com 10 elementos inteiros. 
 * Escreva um programa que imprima cada elemento do vetor A e 
 * uma mensagem indicando se o respectivo elemento é um número primo ou não*/

import java.util.Scanner;

public class Exer33 {

	public static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i=0; i<vetorA.length; i++){
			
			System.out.println("Digite o valor da posição " + i);
			vetorA[i] = scan.nextInt();
		}
		
		
		boolean primo;
		String msg;
		
		for(int i=0; i<vetorA.length; i++){
			
			primo = true;
			for (int j=2; j<vetorA[i]; j++){
				if (vetorA[i] % j == 0){
					primo = false;
					break;
				}
			}
			
			msg="";
			if(primo){
				 msg = " Primo";
			} else{
				msg = " Não é primo";
			}
			System.out.println(vetorA[i] + msg);
		}
	}
}
