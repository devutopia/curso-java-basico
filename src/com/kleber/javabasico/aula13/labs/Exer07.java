package com.kleber.javabasico.aula13.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor de um lado do quadrado: ");
		
		double lado = scan.nextDouble();
		
		double area = Math.pow(lado, 2);
		
		System.out.println("A �rea do quadrado �: " + area);
		
		System.out.println("O dobro da �rea do quadrado �: " + (area * 2));
		
		//ok

	}

}
