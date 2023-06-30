package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

/*Faça um programa que lê as duas notas parciais obtidas por um aluno
numa disciplina ao longo de um semestre, e calcule a sua média. A
atribuição de conceitos obedece a tabela abaixo:

Média de Aproveitamento Conceito
- Entre 9.0 e 10.0 A
- Entre 7.5 e 9.0 B
- Entre 6.0 e 7.5 C
- Entre 4.0 e 6.0 D
- Entre 4.0 e zero E

O algoritmo deve mostrar na tela as notas, a média, o conceito
correspondente e a mensagem "APROVADO" se o conceito for
A, B ou C ou "REPROVADO" se o conceito for D ou E.*/

public class Exer14 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		System.out.println("Entre com as 2 notas do aluno: (n1 n2)");
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();

		double media = (nota1 + nota2) / 2;

		String conceito = "";

		if (media >= 9 && media <= 10) {
			conceito = "A";
		} else if (media >= 7.5 && media < 9) {
			conceito = "B";
		} else if (media >= 6.0 && media < 7.5) {
			conceito = "C";
		} else if (media >= 4.0 && media < 6.0) {
			conceito = "D";
		} else if (media < 4.0) {
			conceito = "E";
		}

		System.out.println("Nota 1   : " + nota1);
		System.out.println("Nota 2   : " + nota2);
		System.out.println("Média    : " + media);
		System.out.println("Conceito : " + conceito);

		switch (conceito) {
			case "A":
			case "B":
			case "C":
				System.out.println("APROVADO");
				break;
			case "D":
			case "E":
				System.out.println("REPROVADO");
				break;
		}
	}
}
