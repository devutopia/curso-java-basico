package com.kleber.javabasico.exercicios11ao13;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite as 4 notas do bimestre. Utilize (,) v�rgula para separar os decimais.");
		System.out.println("Nota 1: ");
		double nota1 = scan.nextDouble();
		System.out.println("Nota 2: ");
		double nota2 = scan.nextDouble();
		System.out.println("Nota 3: ");
		double nota3 = scan.nextDouble();
		System.out.println("Nota 4: ");
		double nota4 = scan.nextDouble();
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A m�dia das notas �: " + media);

	}

}
