package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

//Fa�a um Programa que leia tr�s n�meros e mostre o maior deles.

public class Exer06 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe 3 n�meros no seguinte formato n1 n2 n3");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();
		
		if(num1 > num2 && num1 > num3){
			System.out.println("O maior n�mero digitado foi: " + num1);
		} else if(num2 > num1 && num2 > num3){
			System.out.println("O maior n�mero digitado foi: " + num2);
		} else {
			System.out.println("O maior n�mero digitado foi: " + num3);
		}
	}
	//ok
}
