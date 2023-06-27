package com.kleber.javabasico.aula13.labs;

import java.util.Scanner;

public class Exer08 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		System.out.print("Qual o valor/hora trabalhada?");
		double valorHora = scan.nextDouble();

		System.out.print("Quantas horas vc trabalha no mês? ");
		double horasTrabalhadas = scan.nextDouble();

		double salario = valorHora * horasTrabalhadas;
		System.out.print("Seu salário é de: " + salario);

		// ok

	}

}
