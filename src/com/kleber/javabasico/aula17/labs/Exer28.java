package com.kleber.javabasico.aula17.labs;

import java.util.Scanner;

/*Os n�meros primos possuem v�rias aplica��es dentro da Computa��o, 
 * por exemplo na Criptografia. Um n�mero primo � aquele que � 
 * divis�vel apenas por um e por ele mesmo. Fa�a um programa que pe�a 
 * um n�mero inteiro e determine se ele � ou n�o um n�mero primo.*/

public class Exer28 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero:");
		int num = scan.nextInt();
		
		boolean primo = true;
		
		for (int i=2; i<num; i++){
			if (num % i == 0){
				System.out.println("N�o � n�mero primo - divis�vel por " + i);
				primo = false;
			}
		}
		
		if (primo){
			System.out.println("� n�mero primo.");
		}
	}

}
