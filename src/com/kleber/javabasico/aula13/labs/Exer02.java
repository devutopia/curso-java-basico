package com.kleber.javabasico.aula13.labs;

import java.util.Scanner;

public class Exer02 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		
		int numeroDigitado = scan.nextInt();
		
		System.out.println("O n�mero digitado foi: " + numeroDigitado);
		
		//ok
	}

}
