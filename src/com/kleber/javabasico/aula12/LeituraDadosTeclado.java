package com.kleber.javabasico.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo �: " + nomeCompleto);*/
		
		/*System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome �: " + primeiroNome);*/

		/*System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade �: " + idade);*/
		
		/*System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua idade �: " + altura);*/
		
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura (usar v�gula na digita��o) e se tem bichinho de estima��o:");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		double altura = scan.nextDouble();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Voc� digitou os seguintes valores:");
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Altura: " + altura);
		System.out.println("Tem bichinho de estima��o? " + temPet);
	}
}
