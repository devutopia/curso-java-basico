package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

/*Faça um Programa que leia 2 números e em seguida pergunte ao
usuário qual operação ele deseja realizar. O resultado da operação
deve ser acompanhado de uma frase que diga se o número é:
a par ou ímpar;
b positivo ou negativo;*/

public class Exer19 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Entre com primeiro número:");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com segundo número:");
		int num2 = scan.nextInt();
		
		System.out.println("Escolha a operação (+ - / *)");
		String operacao = scan.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch (operacao) {
		case "+":
			resultado = num1 + num2;
			break;
		case "-":
			resultado = num1 - num2;
			break;
		case "*":
			resultado = num1 * num2;
			break;
		case "/":
			resultado = num1 / num2;
			break;
		default:
			System.out.println("Operação inválida");
			valida = false;
		}
		
		if (valida){
			if (resultado >= 0){
				System.out.println("Resultado positivo: " + resultado);
			} else{
				System.out.println("Resultado negativo:" + resultado);
			}
			if (resultado % 2 == 0){
				System.out.println("Número par");
			} else{
				System.out.println("Número impar");
			}
		}
	}
}
