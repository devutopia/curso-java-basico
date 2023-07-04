package com.kleber.javabasico.aula17.labs;

import java.util.Scanner;

/*Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem
de erro e voltando a pedir as informações.*/

public class Exer02 {

	private static Scanner scan;

	public static void main(String[] args) {

		boolean compara = false;
		String userName;
		String password;

		scan = new Scanner(System.in);

		while (!compara) {

			System.out.println("Digite seu usuario: ");
			userName = scan.next();

			System.out.println("Digite sua senha: ");
			password = scan.next();

			if (userName.equals(password)) {
				System.out.println("ERRO: Usuário e senha inválidas, digite novamente!");
			} else {
				compara = true;
				System.out.println("Usuário: " + userName + " e senha: " + password + ", válidos.");
			}
		}
	}
}
