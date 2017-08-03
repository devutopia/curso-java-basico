package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

import sun.security.util.AlgorithmDecomposer;

/*Faça um Programa que peça os 3 lados de um triângulo. O programa
deverá informar se os valores podem ser um triângulo. Indique, caso
os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
escaleno.
Dicas:
- Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
- Triângulo Equilátero: três lados iguais;
- Triângulo Isósceles: quaisquer dois lados iguais;
- Triângulo Escaleno: três lados diferentes;*/

public class Exer15 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Entre com os lados do triângulo: A B C");
		double ladoA = scan.nextDouble();
		double ladoB = scan.nextDouble();
		double ladoC = scan.nextDouble();
		
		if(ladoA + ladoB < ladoC || ladoB + ladoC < ladoA ||
				ladoA + ladoC < ladoB){
			System.out.println("Não é um triângulo, informe os valores corretamente!");
		}else if(ladoA == ladoB && ladoA == ladoC && ladoB == ladoC);{
			System.out.println("Triângulo Equilátero");
		}

	}

}
