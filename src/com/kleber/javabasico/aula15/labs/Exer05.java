package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

/**Faça um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a média alcançada por aluno e apresentar:
A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
A mensagem "Reprovado", se a média for menor do que sete;
A mensagem "Aprovado com Distinção", se a média for igual a dez.*/

public class Exer05 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe a 1a nota do aluno:");
		double nota1 = scan.nextDouble();
		
		System.out.println("Informe a 2a nota do aluno:");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
	
		System.out.println("Média do aluno " + media);
		
		if (media >= 7 && media < 10){
			System.out.println("Aprovado");
		} else if (media < 7) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Aprovado com distinção");
		}
	}

	//ok
}
