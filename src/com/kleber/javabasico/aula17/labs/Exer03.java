package com.kleber.javabasico.aula17.labs;

/*Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';*/

import java.util.Scanner;

public class Exer03 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		boolean infoValida = false;
		String nome;
		String sexo;
		String estadoCivil;
		int idade;
		double salario;
		
		do {
			System.out.println("Digite seu nome: ");
			nome = scan.next();
			
			if (nome.length() >= 3){
				infoValida = true;
			} else {
				System.out.println("Nome precisa no mínimo de 3 caracteres.");
			}
		} while (!infoValida);
		
		infoValida = false;
		
		do {
			System.out.println("Digite sua idade: ");
			idade = scan.nextInt();
			
			if (idade >= 0 && idade <= 150){
				infoValida = true;
			} else {
				System.out.println("Idade precisa ser entre 0 e 150.");
			}
		} while (!infoValida);
		
		infoValida = false;
		
		do {
			System.out.println("Digite seu salário: ");
			salario = scan.nextDouble();
			
			if (salario > 0){
				infoValida = true;
			} else {
				System.out.println("Salário precisa ser maior que 0");
			}
		} while (!infoValida);
		
		infoValida = false;
		
		do {
			System.out.println("Digite seu gênero: ");
			sexo = scan.next();
			
			if (sexo.equalsIgnoreCase("f") ||
					sexo.equalsIgnoreCase("m")){
				infoValida = true;
			} else {
				System.out.println("Gênero inválido, digite 'm' ou 'f'.");
			}
		} while (!infoValida);
		
		infoValida = false;
		
		do {
			System.out.println("Digite o estado civil: ");
			estadoCivil = scan.next();
			
			if (estadoCivil.equalsIgnoreCase("s") ||
					sexo.equalsIgnoreCase("c") ||
					sexo.equalsIgnoreCase("v") ||
					sexo.equalsIgnoreCase("d")){
				infoValida = true;
			} else {
				System.out.println("Estado civil precisa ser 's', 'c', 'v' ou 'd'.");
			}
		} while (!infoValida);
		
		System.out.println("As seguintes informações foram coletadas:");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado civil: " + estadoCivil);
	}
}
