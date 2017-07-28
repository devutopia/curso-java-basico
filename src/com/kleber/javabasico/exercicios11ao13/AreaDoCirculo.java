package com.kleber.javabasico.exercicios11ao13;

import java.util.Scanner;

public class AreaDoCirculo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor do raio do círculo: ");
		
		
		double PI = 3.1415926;
		double raio = scan.nextDouble();
		double area = PI * (raio * raio);
		
		System.out.println("Área do círculo: " + area);

	}

}
