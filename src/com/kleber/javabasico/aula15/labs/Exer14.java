package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

/*Fa�a um programa que l� as duas notas parciais obtidas por um aluno
numa disciplina ao longo de um semestre, e calcule a sua m�dia. A
atribui��o de conceitos obedece � tabela abaixo:

M�dia de Aproveitamento Conceito
- Entre 9.0 e 10.0 A
- Entre 7.5 e 9.0 B
- Entre 6.0 e 7.5 C
- Entre 4.0 e 6.0 D
- Entre 4.0 e zero E

O algoritmo deve mostrar na tela as notas, a m�dia, o conceito
correspondente e a mensagem �APROVADO� se o conceito for
A, B ou C ou �REPROVADO� se o conceito for D ou E.*/

public class Exer14 {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Entre com as 2 notas do aluno: (n1 n2)");
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double media = (nota1 + nota2) / 2;
		char conceito = ' ';
		String msg = null;
		
		if (media >= 9 && media <= 10){
			conceito = 'A';
			msg = "APROVADO";
		}else if(media >= 7.5 && media < 9){
			conceito = 'B';
			msg = "APROVADO";
		}else if(media >= 6.0 && media < 7.5){
			conceito = 'C';
			msg = "APROVADO";
		}else if(media >= 4.0 && media < 6.0){
			conceito = 'D';
			msg = "REPROVADO";
		}else if(media < 4.0){
			conceito = 'E';
			msg = "REPROVADO";
		}
		
		System.out.println("Nota 1   : " + nota1);
		System.out.println("Nota 2   : " + nota2);
		System.out.println("M�dia    : " + media);
		System.out.println("Conceito : " + conceito);
		System.out.println("Situa��o : " + msg);
	}
}
