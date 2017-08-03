package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

/*Fa�a um Programa que verifique se uma letra digitada � "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inv�lido.*/

public class Exer03 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe seu sexo (M - F)");
		String sexo = scan.next();
		
		//Pesquisar if else com Strings
		if (sexo.equalsIgnoreCase("M")){
			System.out.println("Sexo Masculino");
		} else if (sexo.equalsIgnoreCase("F")) {
			System.out.println("Sexo Feminino");
		} else {
			System.out.println("Sexo inv�lido");
		}
		
		
		switch (sexo.toUpperCase()) {
		case "M": System.out.println("Sexo Masculino"); break;
		case "F": System.out.println("Sexo Feminino"); break;
		default: System.out.println("Sexo Inv�lido"); break;
		}
	}
	//ok
}
