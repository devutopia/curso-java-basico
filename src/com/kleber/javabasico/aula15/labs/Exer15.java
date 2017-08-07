package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

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
				System.out.println("Tri�ngulo Equil�tero");
			}else if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC){
				System.out.println("Tri�ngulo Escaleno");
			}else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC){
				System.out.println("Tri�ngulo Is�sceles");
			}
		}else {
			System.out.println("N�o � um tri�ngulo, informe os valores corretamente!");
		}
		
	}
}