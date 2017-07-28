package com.kleber.javabasico.exercicios11ao13;

import java.util.Scanner;

public class ConverteCentimetros {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor dos metros a serem convertidos: ");
		
		float metros = scan.nextFloat();
		
		System.out.println("Quantidade dos metros em centimetros: " + metros * 100 + " cm");
		

	}

}
