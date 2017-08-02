package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

/*Fa�a um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a m�dia alcan�ada por aluno e apresentar:
A mensagem "Aprovado", se a m�dia alcan�ada for maior ou igual a sete;
A mensagem "Reprovado", se a m�dia for menor do que sete;
A mensagem "Aprovado com Distin��o", se a m�dia for igual a dez.*/

public class Exer05 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe a 1� nota do aluno:");
		double nota1 = scan.nextDouble();
		
		System.out.println("Informe a 2� nota do aluno:");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7 && media < 10){
			System.out.println("Aprovado");
		} else if (media < 7) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Aprovado com distin��o");
		}
	}
}
