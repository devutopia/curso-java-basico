package com.kleber.javabasico.aula17.labs;

/*Altere o programa anterior permitindo ao usuário informar as
populações e as taxas de crescimento iniciais. Valide a entrada e
permita repetir a operação*/

import java.util.Scanner;

public class Exer05 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		boolean valido = false;
		double popA;
		double popB;
		double taxaA;
		double taxaB;
		
		do {
			System.out.println("Informe a população do País A: ");
			popA = scan.nextDouble();
			
			if (popA > 0){
				valido = true;
			} else {
				System.out.println("População precisa ser maior que 0.");
			}
		} while (!valido);
		
		valido = false;
		
		do {
			System.out.println("Informe a população do País B: ");
			popB = scan.nextDouble();
			
			if (popB > 0){
				valido = true;
			} else {
				System.out.println("População precisa ser maior que 0.");
			}
		} while (!valido);
		
		valido = false;
		
		do {
			System.out.println("Informe a taxa de crescimento da população A: ");
			taxaA = scan.nextDouble();
			
			if (taxaA > 0){
				valido = true;
			} else {
				System.out.println("A taxa de crescimento precisa ser maior que 0.");
			}
		} while (!valido);
		
		valido = false;
		
		do {
			System.out.println("Informe a taxa de crescimento da população B: ");
			taxaB = scan.nextDouble();
			
			if (taxaB > 0){
				valido = true;
			} else {
				System.out.println("A taxa de crescimento precisa ser maior que 0.");
			}
		} while (!valido);
		
		int cont = 0;
		
		while (popA < popB){
			popA += (popA/100) * taxaA;
			popB += (popB/100) * taxaB;
			cont++;
		}
		System.out.println("População A: " + popA);
		System.out.println("População B: " + popB);
		System.out.println("Qtd anos   : " + cont);
	}
		
}