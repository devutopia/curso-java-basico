package com.kleber.javabasico.aula13.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o valor/hora trabalhada?");
		double valorHora = scan.nextDouble();
		
		System.out.println("Quantas horas vc trabalha no m�s? ");
		double horasTrabalhadas = scan.nextDouble();
		
		double salario = valorHora * horasTrabalhadas;
		System.out.println("Seu sal�rio � de: " + salario);
		
		//ok

	}

}
