package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

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
		
		System.out.println("Entre com lado A");
		int ladoA = scan.nextInt();
		
		System.out.println("Entre com lado B");
		int ladoB = scan.nextInt();
		
		System.out.println("Entre com lado C");
		int ladoC = scan.nextInt();
		
		if(((ladoA + ladoB) > ladoC) || 
				((ladoA + ladoC) > ladoB) ||
				((ladoB + ladoC) > ladoA)){
			
			if(ladoA == ladoB && ladoA == ladoC && ladoB == ladoC){
				System.out.println("Triângulo Equilátero");
			}else if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC){
				System.out.println("Triângulo Escaleno");
			}else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC){
				System.out.println("Triângulo Isósceles");
			}
		}else {
			System.out.println("Não é um triângulo, informe os valores corretamente!");
		}
		
	}
}