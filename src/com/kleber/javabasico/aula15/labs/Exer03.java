package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

/*Faça um Programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.*/

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
			System.out.println("Sexo inválido");
		}
		
		
		switch (sexo.toUpperCase()) {
		case "M": System.out.println("Sexo Masculino"); break;
		case "F": System.out.println("Sexo Feminino"); break;
		default: System.out.println("Sexo Inválido"); break;
		}
	}
	//ok
}
