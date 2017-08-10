package com.kleber.javabasico.aula17.labs;

import java.util.Scanner;

/*Fa�a um programa que pe�a dois n�meros, base e expoente, calcule e
mostre o primeiro n�mero elevado ao segundo n�mero. N�o utilize a
fun��o de pot�ncia da linguagem.*/

public class Exer13 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe o n�mero base: ");
		int base = scan.nextInt();
		
		System.out.println("Informe pot�ncia: ");
		int expoente = scan.nextInt();
		
		int cont = 1;
		int resultado = base;
		
		while(cont < expoente){
			resultado *= base;
			cont ++;
		}
		
		System.out.println("Resultado com 'while': " + resultado);
		
		resultado = base;
		
		for (int i=1; i < expoente; i++){
			resultado *= base;
		}
		
		System.out.println("Resultado com 'for': " + resultado);
	}

}
