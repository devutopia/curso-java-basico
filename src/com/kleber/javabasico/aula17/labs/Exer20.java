package com.kleber.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer20 {

	private static Scanner scan;

	public static void main(String[] args) {
	
		scan = new Scanner(System.in);
		
		System.out.println("Entre com a qtd de idades:");
		int idades = scan.nextInt();
		
		int idade;
		int soma = 0;
		
		for (int i=0; i < idades; i++){
			System.out.println("Entre com a idade da pessoa " + i);
		
			idade = scan.nextInt();
			
			soma += idade;
		}
		
		double media = soma / idades;
		System.out.println("Média de idade: " + media);
		
		if (media <= 0 && media <= 25){
			System.out.println("Jovem");
		} else if (media > 25 && media <=60){
			System.out.println("Adulta");
		} else if (media > 60){
			System.out.println("Idosa");
		}

	}

}
