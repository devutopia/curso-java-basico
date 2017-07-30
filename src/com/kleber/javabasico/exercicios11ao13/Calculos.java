package com.kleber.javabasico.exercicios11ao13;

import java.util.Scanner;

public class Calculos {
	
	/*Faça um Programa que peça 2 números inteiros e um número real.
	Calcule e mostre:
	a. o produto do dobro do primeiro com metade do segundo .
	b. a soma do triplo do primeiro com o terceiro.
	c. o terceiro elevado ao cubo*/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número inteiro: ");
		
		int primeiroNumero = scan.nextInt();
		
		System.out.println("Entre com o segundo número inteiro: ");
		
		int segundoNumero = scan.nextInt();
		
		System.out.println("Entre com um número real: ");
		
		double terceiroNumero = scan.nextDouble();
		
		System.out.println((primeiroNumero * 2) + (segundoNumero / 2));
		System.out.println((primeiroNumero * 3) + terceiroNumero);
		System.out.println(Math.pow(terceiroNumero, 2));

	}

}
