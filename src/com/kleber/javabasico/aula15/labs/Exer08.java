package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

/*Fa�a um programa que pergunte o pre�o de tr�s produtos e informe
qual produto voc� deve comprar, sabendo que a decis�o � sempre
pelo mais barato.*/

public class Exer08 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe o pre�o 1� produto");
		double produto1 = scan.nextDouble();
		System.out.println("Informe o pre�o 2� produto");
		double produto2 = scan.nextDouble();
		System.out.println("Informe o pre�o 3� produto");
		double produto3 = scan.nextDouble();
		
		if(produto1 <= produto2 && produto1 <= produto3){
			System.out.println("O melhor pre�o � do 1� produto");
		} else if(produto2 <= produto1 && produto2 <= produto3){
			System.out.println("O melhor pre�o � do 2� produto");
		} else {
			System.out.println("O melhor pre�o � do 3� produto");
		}
	}
	//ok
}
