package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

/*Faça um Programa que pergunte em que turno você estuda. 
Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
Inválido!", conforme o caso.
*/
public class Exer10 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		System.out.println("Informe o período que vc estuda M (manhã) - V (vespertino) - N (noturno)");
		String msg = scan.nextLine();
		
		if (msg.equalsIgnoreCase("M")){
			System.out.println("Bom dia!");
		} else if(msg.equalsIgnoreCase("V")) {
			System.out.println("Boa tarde!");
		} else if(msg.equalsIgnoreCase("N")) {
			System.out.println("Boa noite!");
		} else{
			System.out.println("Valor inválido");
		}
				
		switch (msg.toLowerCase()) {
		case "m":
			System.out.println("Bom dia!");
			break;
		case "v":
			System.out.println("Boa tarde!");
			break;
		case "n":
			System.out.println("Boa noite!");
			break;
		default:
			System.out.println("Valor inválido");
			break;
		}

	}
}
