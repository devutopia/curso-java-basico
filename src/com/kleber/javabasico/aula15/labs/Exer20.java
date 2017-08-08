package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

/*Fa�a um programa que fa�a 5 respostas para uma pessoa sobre um
crime. As respostas s�o:
	
a. "Telefonou para a v�tima?"
b. "Esteve no local do crime?"
c. "Mora perto da v�tima?"
d. "Devia para a v�tima?"
e. "J� trabalhou com a v�tima?" 

O programa deve no final emitir
uma classifica��o sobre a participa��o da pessoa no crime. Se
a pessoa responder positivamente a 2 quest�es ela deve ser
classificada como "Suspeita", entre 3 e 4 como "C�mplice" e 5
como "Assassino". Caso contr�rio, ele ser� classificado como
"Inocente".*/

public class Exer20 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Telefonou para a v�tima? (sim - n�o)");
		String resposta1 = scan.next();
		
		System.out.println("Esteve no local do crime? (sim - n�o)");
		String resposta2 = scan.next();
		
		System.out.println("Mora perto da v�tima? (sim - n�o)");
		String resposta3 = scan.next();
		
		System.out.println("Devia para a v�tima? (sim - n�o)");
		String resposta4 = scan.next();
		
		System.out.println("J� trabalhou com a v�tima? (sim - n�o)");
		String resposta5 = scan.next();
		
		
		int cont = 0;
		
		if(resposta1.equals("sim")){
			cont++;
		}
		if(resposta2.equals("sim")){
			cont++;
		}
		if(resposta3.equals("sim")){
			cont++;
		}
		if(resposta4.equals("sim")){
			cont++;
		}
		if(resposta5.equals("sim")){
			cont++;
		}
		
		if (cont == 2){
			System.out.println("Suspeito");
		} else if (cont == 3 || cont == 4 ){
			System.out.println("Cumplice");
		} else if (cont == 5){
			System.out.println("Assassino");
		} else{
			System.out.println("Inocente");
		}

	}

}
