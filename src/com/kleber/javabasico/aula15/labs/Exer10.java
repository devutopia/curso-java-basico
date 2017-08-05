package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

/*Fa�a um Programa que pergunte em que turno voc� estuda. 
Pe�a para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
Inv�lido!", conforme o caso.
*/
public class Exer10 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		System.out.println("Informe o per�odo que vc estuda M (manh�) - V (vespertino) - N (noturno)");
		String msg = scan.nextLine();
		
		if (msg.equalsIgnoreCase("M")){
			System.out.println("Bom dia!");
		} else if(msg.equalsIgnoreCase("V")) {
			System.out.println("Boa tarde!");
		} else if(msg.equalsIgnoreCase("N")) {
			System.out.println("Boa noite!");
		} else{
			System.out.println("Valor inv�lido");
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
			System.out.println("Valor inv�lido");
			break;
		}

	}
}
