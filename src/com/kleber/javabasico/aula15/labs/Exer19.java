package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

/*Fa�a um Programa que leia 2 n�meros e em seguida pergunte ao
usu�rio qual opera��o ele deseja realizar. O resultado da opera��o
deve ser acompanhado de uma frase que diga se o n�mero �:
a par ou �mpar;
b positivo ou negativo;*/

public class Exer19 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Entre com primeiro n�mero:");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com segundo n�mero:");
		int num2 = scan.nextInt();
		
		System.out.println("Escolha a opera��o (+ - / *)");
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
			System.out.println("Opera��o inv�lida");
			valida = false;
		}
		
		if (valida){
			if (resultado >= 0){
				System.out.println("Resultado positivo: " + resultado);
			} else{
				System.out.println("Resultado negativo:" + resultado);
			}
			if (resultado % 2 == 0){
				System.out.println("N�mero par");
			} else{
				System.out.println("N�mero impar");
			}
		}
	}
}
