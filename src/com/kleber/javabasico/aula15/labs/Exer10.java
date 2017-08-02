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
			System.out.println("Matutino");
		} else if(msg.equalsIgnoreCase("V")) {
			System.out.println("Vespertino");
		} else {
			System.out.println("Noturno");
		}
				
		switch (msg.toLowerCase()) {
		case "m":
			System.out.println("Matutino");
			break;
		case "v":
			System.out.println("Vespertino");
			break;
		default:
			System.out.println("Noturno");
			break;
		}

	}
}
