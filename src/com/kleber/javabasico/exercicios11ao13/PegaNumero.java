package com.kleber.javabasico.exercicios11ao13;

import java.util.Scanner;

public class PegaNumero {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		
		int numeroDigitado = scan.nextInt();
		
		System.out.println("O n�mero digitado foi: " + numeroDigitado);
	}

}
