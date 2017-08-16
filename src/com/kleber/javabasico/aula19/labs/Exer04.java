package com.kleber.javabasico.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

/*Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho,
 *  sendo que cada elemento do vetor B dever� ser a raiz quadrada do respectivo elemento de A,
 *  ou seja: B[i] = sqrt(A[i])*/

public class Exer04 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		double[] vetorB = new double[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i ++){
			System.out.println("Digite o valor para o elemento: " + i);
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		
		System.out.print("Vetor A  = ");
		for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        DecimalFormat df = new DecimalFormat("###,###.###");
        
		System.out.print("Vetor B  = ");
		for (int i=0; i<vetorB.length; i++){
            System.out.print(df.format(vetorB[i]) + " ");
        }
	}

}
