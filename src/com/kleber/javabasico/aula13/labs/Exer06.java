package com.kleber.javabasico.aula13.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor do raio do c�rculo: ");
		
		double raio = scan.nextDouble();
		double area = Math.PI * (raio * raio);
		
		System.out.println("�rea do c�rculo: " + area);
		
		//ok
	}

}
