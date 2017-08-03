package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

import sun.security.util.AlgorithmDecomposer;

/*Fa�a um Programa que pe�a os 3 lados de um tri�ngulo. O programa
dever� informar se os valores podem ser um tri�ngulo. Indique, caso
os lados formem um tri�ngulo, se o mesmo �: equil�tero, is�sceles ou
escaleno.
Dicas:
- Tr�s lados formam um tri�ngulo quando a soma de quaisquer dois lados for maior que o terceiro;
- Tri�ngulo Equil�tero: tr�s lados iguais;
- Tri�ngulo Is�sceles: quaisquer dois lados iguais;
- Tri�ngulo Escaleno: tr�s lados diferentes;*/

public class Exer15 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Entre com os lados do tri�ngulo: A B C");
		double ladoA = scan.nextDouble();
		double ladoB = scan.nextDouble();
		double ladoC = scan.nextDouble();
		
		if(ladoA + ladoB < ladoC || ladoB + ladoC < ladoA ||
				ladoA + ladoC < ladoB){
			System.out.println("N�o � um tri�ngulo, informe os valores corretamente!");
		}else if(ladoA == ladoB && ladoA == ladoC && ladoB == ladoC);{
			System.out.println("Tri�ngulo Equil�tero");
		}

	}

}
