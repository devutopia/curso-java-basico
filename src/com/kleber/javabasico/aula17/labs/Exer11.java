package com.kleber.javabasico.aula17.labs;

//Altere o programa anterior para mostrar no final a soma dos n�meros.

import java.util.Scanner;

public class Exer11 {

		private static Scanner scan;

		public static void main(String[] args) {
			
			scan = new Scanner(System.in);
			
			
			System.out.println("Entre com o primeiro n�mero:");
			int num1 = scan.nextInt();
			
			System.out.println("Entre com o segundo n�mero:");
			int num2 = scan.nextInt();
			
			int soma = 0;
					
			for (int i=num1; i<=num2; i++){
				System.out.println(i);
				soma += i;
			}
			System.out.println("Soma dos n�meros apresentados = " + soma);
		}
}
