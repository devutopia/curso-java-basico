package com.kleber.javabasico.aula17.labs;

import java.util.Scanner;

/*Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
número ele deseja ver a tabuada. A saída deve ser conforme o
exemplo abaixo:
- Tabuada de 5:
- 5 X 1 = 5
- 5 X 2 = 10
- ...
- 5 X 10 = 50*/

public class Exer12 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		int num;
		// int result;

		System.out.println("Deseja calcular qual tabuada?");
		num = scan.nextInt();

		System.out.println("Tabuada de " + num);
		for (int i = 1; i <= 10; i++) {
			// result = num * i;
			System.out.println(num + " x " + i + " = " + (num * i));
		}
	}
}
