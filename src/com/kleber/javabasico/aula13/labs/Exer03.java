package com.kleber.javabasico.aula13.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		
		int primeiroNumero = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		
		int segundoNumero = scan.nextInt();
		
		int resultado = primeiroNumero + segundoNumero;
		
		System.out.println("A soma dos números digitados é: " + resultado);
		
		//ok

	}

}
