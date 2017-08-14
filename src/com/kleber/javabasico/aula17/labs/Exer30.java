package com.kleber.javabasico.aula17.labs;

import java.util.Scanner;

/*Desenvolva um programa que faça a tabuada de um número qualquer
inteiro que será digitado pelo usuário, mas a tabuada não deve
necessariamente iniciar em 1 e terminar em 10, o valor inicial e final
devem ser informados também pelo usuário, conforme exemplo
abaixo:
- Montar a tabuada de: 5 Começar por: 4
- Terminar em: 7

- Vou montar a tabuada de 5 começando em 4 e terminando em 7:

	- 5 X 4 = 20
- 5 X 5 = 25
- 5 X 6 = 30
- 5 X 7 = 35

Obs: Você deve verificar se o usuário não digitou o final menor
que o inicial.*/


public class Exer30 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		int num;
		int inicio;
		int fim;
		boolean valido = true;
		
		System.out.println("Montar a tabuada de: ");
		num = scan.nextInt();
		
		do{
			System.out.println("Começar por: (0 - 10)");
			inicio = scan.nextInt();
			
			System.out.println("Terminar em: (0 - 10)");
			fim = scan.nextInt();
			
			if(inicio > fim){
				System.out.println("Número inicial maior que número final, informe novamente:");
			}
			valido = true;
		} while (!valido);
		
		System.out.println("Vou montar a tabuada de "+ num + " começando em " + inicio + " e terminando em " + fim);
		
		for (int i = inicio; i <= fim; i++){
			System.out.println(num + " x " + i + " = " + (num * i));
		}

	}

}
