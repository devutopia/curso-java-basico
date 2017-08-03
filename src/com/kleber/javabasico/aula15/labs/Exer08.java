package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

/*Faça um programa que pergunte o preço de três produtos e informe
qual produto você deve comprar, sabendo que a decisão é sempre
pelo mais barato.*/

public class Exer08 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe o preço 1º produto");
		double produto1 = scan.nextDouble();
		System.out.println("Informe o preço 2º produto");
		double produto2 = scan.nextDouble();
		System.out.println("Informe o preço 3º produto");
		double produto3 = scan.nextDouble();
		
		if(produto1 <= produto2 && produto1 <= produto3){
			System.out.println("O melhor preço é do 1º produto");
		} else if(produto2 <= produto1 && produto2 <= produto3){
			System.out.println("O melhor preço é do 2º produto");
		} else {
			System.out.println("O melhor preço é do 3º produto");
		}
	}
	//ok
}
