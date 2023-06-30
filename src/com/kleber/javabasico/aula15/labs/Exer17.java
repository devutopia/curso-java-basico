package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

/*Faça um Programa que peça um número correspondente a um
determinado ano e em seguida informe se este ano é ou não bissexto.*/

public class Exer17 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		System.out.println("Entre com o Ano:");
		int ano = scan.nextInt();

		if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println("Esse é uma ano bissexto");
		} else {
			System.out.println("Não é um ano bissexto");
		}
	}
}
