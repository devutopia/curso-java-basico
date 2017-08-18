package com.kleber.javabasico.aula19.labs;

/**Ler as duas notas bimestrais para um conjunto de 10 alunos.
 * Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do tipo real. 
 * Escreva um programa que calcule a média aritmética simples das notas informadas 
 * armazenando o resultado em um vetor “Result” de mesmo tipo e tamanho.
 * Ao mostrar os resultados exibir a situaçãode cada aluno.
 * Se a média calculada for superior ou igual a 7 o aluno estará “aprovado”, 
 * caso contrário, a situação do aluno será “reprovado”.*/

import java.util.Scanner;

public class Exer19 {

public static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		double[] notas1 = new double[10];
		double[] notas2 = new double[notas1.length];
		double[] result = new double[notas1.length];
		
		for(int i = 0; i < notas1.length; i++){
			System.out.println("Informe a Nota1 do aluno " + (i+1));
			notas1[i] = scan.nextDouble();
		}
				
		for(int i = 0; i < notas2.length; i++){
			System.out.println("Informe a Nota2 do aluno " + (i+1));
			notas2[i] = scan.nextDouble();
		}
		
		for(int i = 0; i < result.length; i++){
			
			result[i] = (notas1[i]+notas2[i])/2;
			
			if(result[i] >= 7){
				System.out.println("Média do aluno " + (i+1) + " = " + result[i] + " APROVADO!" );
			} else {
				System.out.println("Média do aluno " + (i+1) + " = " + result[i] + " REPROVADO!" );
			}
			
		}
	}

}
