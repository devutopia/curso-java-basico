package com.kleber.javabasico.aula13.labs;

import java.util.Scanner;

public class Exer11 {
	
	/*Fa�a um Programa que pe�a 2 n�meros inteiros e um n�mero real.
	Calcule e mostre:
	a. o produto do dobro do primeiro com metade do segundo .
	b. a soma do triplo do primeiro com o terceiro.
	c. o terceiro elevado ao cubo*/

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero inteiro: ");
		
		int primeiroNumero = scan.nextInt();
		
		System.out.println("Entre com o segundo n�mero inteiro: ");
		
		int segundoNumero = scan.nextInt();
		
		System.out.println("Entre com um n�mero real: ");
		
		double terceiroNumero = scan.nextDouble();
		
		System.out.println((primeiroNumero * 2) + (segundoNumero / 2));
		System.out.println((primeiroNumero * 3) + terceiroNumero);
		System.out.println(Math.pow(terceiroNumero, 3));

	}

}
