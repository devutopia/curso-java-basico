package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

/*Faça um Programa que leia três números e mostre-os em ordem
decrescente.*/

public class Exer09 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe 3 números no seguinte formato n1 n2 n3");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();
		
		if (num1 <= num2 && num2 <= num3){
			//num1 é menor
			System.out.println(num3 + ", " + num2  + ", " + num1);
		} else if (num1 <= num3 && num3 <= num2){
			System.out.println(num2 + ", " + num3  + ", " + num1);
		} else if (num2 <= num1 && num1 <= num3){
			System.out.println(num3 + ", " + num1  + ", " + num2);
		} else if (num2 <= num3 && num3 <= num1){
			System.out.println(num1 + ", " + num3  + ", " + num2);
		} else if (num3 <= num1 && num1 <= num2){
			System.out.println(num2 + ", " + num1  + ", " + num3);
		} else {
			System.out.println(num1 + ", " + num2  + ", " + num3);
		}
	}
}
