package com.kleber.javabasico.exercicios11ao13;

import java.util.Scanner;

public class SalarioMensal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o valor da sua hora trabalhada? ");
		
		double valorHora = scan.nextDouble();
		
		System.out.println("Quantas horas vc trabalha no m�s? ");
		
		int horasTrabalhadas = scan.nextInt();
		
		double salario = valorHora * horasTrabalhadas;
		
		System.out.println("Seu sal�rio mensal � de: " + salario);

	}

}
