package com.kleber.javabasico.exercicios11ao13;

import java.util.Scanner;

public class AreaDoQuadrado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor de um lado do quadrado: ");
		
		double lado = scan.nextDouble();
		lado = Math.pow(lado, 2);
		
		System.out.println("A área do quadrado é: " + lado);
		
		double dobroQuadrado = lado * 2;
		
		System.out.println("O dobro da área do quadrado é: " + dobroQuadrado);

	}

}
