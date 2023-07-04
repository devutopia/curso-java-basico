package com.kleber.javabasico.aula17.labs;

import java.util.Scanner;

/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o
usuário informe um valor válido.*/

public class Exer01 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		boolean notaValida = false;
		double nota = 0;
		do {
			System.out.println("Digite uma nota (0 - 10):");
			nota = scan.nextDouble();
			if (nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("Nota digitada: " + nota);
			} else {
				System.out.println("Nota inválida, digite novamente.");
			}
		} while (!notaValida);
	}
}
