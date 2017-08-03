package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

/*Faça um Programa que verifique se uma letra digitada é vogal ou
consoante.*/

public class Exer04 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe uma letra do alfabeto:");
		String letra = scan.next();
		
		if (letra.length() > 1){
			System.out.println("Não é uma letra válida");
		} else {
			switch (letra.toLowerCase()) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
				System.out.println("Essa é uma vogal");
				break;
			default:
				System.out.println("Essa é uma consoante");
			}
		}
	}
	//ok
}
