package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

/*Fa�a um Programa que leia tr�s n�meros e mostre o maior e o menor
deles.*/

public class Exer07 {
		
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe 3 n�meros no seguinte formato n1 n2 n3");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();
		double menor;
		double maior;
		
		if(num1 > num2){
			maior = num1;
			menor = num2;
		} else {
			maior = num2;
			menor = num1;
		}		
		if(maior < num3){
			maior = num3;
		}
		if(menor > num3){
			menor = num3;
		}
		System.out.println("O maior valor � " + maior + " o menor valor � " + menor);
	}
	//ok
}
