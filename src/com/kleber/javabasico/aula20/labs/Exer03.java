package com.kleber.javabasico.aula20.labs;

import java.util.Scanner;

/**Capture do teclado valores para preenchimento de uma matriz M 3x3.
 * Após a captura imprima a matriz criada e encontre a quantidade de números pares, a quantidade de números ímpares*/

public class Exer03 {

	private static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int[][] valoresNumericos = new int[3][3];
		
		System.out.println("Entre com os valores da matriz: ");
		
		for (int i=0; i<valoresNumericos.length; i++){
			for (int j=0; j<valoresNumericos[i].length; j++){
				System.out.println("Posição [" + i + " | " + j + "]");
				valoresNumericos[i][j] = scan.nextInt();
			}
		}
		
		int qtdPares = 0;
		int qtdImpares = 0;
		
		for (int i=0; i<valoresNumericos.length; i++){
			for (int j=0; j<valoresNumericos[i].length; j++){
				if (valoresNumericos[i][j] % 2 == 0){
					qtdPares++;
				} else {
					qtdImpares++;
				}
			}
		}
		
		for (int i=0; i<valoresNumericos.length; i++){
			for (int j=0; j<valoresNumericos[i].length; j++){
				System.out.print(valoresNumericos[i][j] + " | ");
			}
			System.out.println();
		}
		
		System.out.println("Quantidade de números pares: " + qtdPares);
		System.out.println("Quantidade de números ímpares: " + qtdImpares);
	}

}
