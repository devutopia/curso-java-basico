package com.kleber.javabasico.exercicios11ao13;

import java.util.Scanner;

public class SomaNumeros {

	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		
		int primeiroNumero = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		
		int segundoNumero = scan.nextInt();
		
		int resultado = primeiroNumero + segundoNumero;
		
		System.out.println("A soma dos n�meros digitados �: " + resultado);

	}

}
