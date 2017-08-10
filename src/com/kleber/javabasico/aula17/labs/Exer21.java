package com.kleber.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer21 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Entre com a qtd de turmas:");
		int numTurmas = scan.nextInt();

		int numAlunos;
		int soma = 0;
		boolean invalido = true;
		
		for (int i = 1; i <= numTurmas; i++){
			
			invalido = true;
			do{
				System.out.println("Entre com a qtd de alunos da turma: " + i);
				numAlunos = scan.nextInt();
				
				if(numAlunos <= 40){
					invalido = false;
				} else {
					System.out.println("Números de alunos acima de 40, refaça a operação");
				}
				
			} while (invalido);
			
			soma += numTurmas;
		}
	
		double media = soma / numTurmas;
		System.out.println("Media: " + media);
	}

}
