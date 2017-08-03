package com.kleber.javabasico.aula13.labs;

import java.util.Scanner;

public class Exer05 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor dos metros.");
		
		float metros = scan.nextFloat();
		
		System.out.println("Quantidade dos metros em centimetros: " + metros * 100 + " cm");
		
		//ok
	}

}
