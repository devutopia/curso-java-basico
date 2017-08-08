package com.kleber.javabasico.aula17.labs;

/*Fa�a um programa que leia e valide as seguintes informa��es:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Sal�rio: maior que zero;
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
				System.out.println("Nome precisa no m�nimo de 3 caracteres.");
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
			System.out.println("Digite seu sal�rio: ");
			salario = scan.nextDouble();
			
			if (salario > 0){
				infoValida = true;
			} else {
				System.out.println("Sal�rio precisa ser maior que 0");
			}
		} while (!infoValida);
		
		infoValida = false;
		
		do {
			System.out.println("Digite seu g�nero: ");
			sexo = scan.next();
			
			if (sexo.equalsIgnoreCase("f") ||
					sexo.equalsIgnoreCase("m")){
				infoValida = true;
			} else {
				System.out.println("G�nero inv�lido, digite 'm' ou 'f'.");
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
		
		System.out.println("As seguintes informa��es foram coletadas:");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sal�rio: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado civil: " + estadoCivil);
	}
}
