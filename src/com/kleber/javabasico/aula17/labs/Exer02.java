package com.kleber.javabasico.aula17.labs;

import java.util.Scanner;

/*Fa�a um programa que leia um nome de usu�rio e a sua senha e n�o
aceite a senha igual ao nome do usu�rio, mostrando uma mensagem
de erro e voltando a pedir as informa��es.*/

public class Exer02 {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		boolean compara = false;
		String userName;
		String password;
		
		scan = new Scanner(System.in);
		
		while (!compara){
			
			System.out.println("Digite seu usuario: ");
			userName = scan.next();
			
			System.out.println("Digite sua senha: ");
			password = scan.next();
			
			if (userName.equals(password)){
				System.out.println("ERRO: Usu�rio e senha inv�lidas, digite novamente!");
			} else {
				compara = true;
				System.out.println("Usu�rio: " + userName + " e senha: " + password + ", v�lidos.");
			}
		}
	}
}
