package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

/*Faça um programa que faça 5 respostas para uma pessoa sobre um
crime. As respostas são:
	
a. "Telefonou para a vítima?"
b. "Esteve no local do crime?"
c. "Mora perto da vítima?"
d. "Devia para a vítima?"
e. "Já trabalhou com a vítima?" 

O programa deve no final emitir
uma classificação sobre a participação da pessoa no crime. Se
a pessoa responder positivamente a 2 questões ela deve ser
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5
como "Assassino". Caso contrário, ele será classificado como
"Inocente".*/

public class Exer20 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		System.out.println("Telefonou para a vítima? (sim - não)");
		String resposta1 = scan.next();

		System.out.println("Esteve no local do crime? (sim - não)");
		String resposta2 = scan.next();

		System.out.println("Mora perto da vítima? (sim - não)");
		String resposta3 = scan.next();

		System.out.println("Devia para a vítima? (sim - não)");
		String resposta4 = scan.next();

		System.out.println("Já trabalhou com a vítima? (sim - não)");
		String resposta5 = scan.next();

		int cont = 0;

		if (resposta1.equalsIgnoreCase("sim")) {
			cont++;
		}
		if (resposta2.equalsIgnoreCase("sim")) {
			cont++;
		}
		if (resposta3.equalsIgnoreCase("sim")) {
			cont++;
		}
		if (resposta4.equalsIgnoreCase("sim")) {
			cont++;
		}
		if (resposta5.equalsIgnoreCase("sim")) {
			cont++;
		}

		if (cont == 2) {
			System.out.println("Suspeito");
		} else if (cont == 3 || cont == 4) {
			System.out.println("Cumplice");
		} else if (cont == 5) {
			System.out.println("Assassino");
		} else {
			System.out.println("Inocente");
		}
	}
}
