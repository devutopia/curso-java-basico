package com.kleber.javabasico.aula36.labs;

import java.util.Scanner;

public class Exer01 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		Agenda agenda = new Agenda();
				
		System.out.println("Entre com o nome da agenda");
		agenda.setNomeAgenda(scan.nextLine());
		
		Contato[] contatos = new Contato[3];
		
		for (int i = 0; i<3; i++){
			System.out.println("Entre com as informações do contato " + (i+1));
			Contato c = new Contato();
			
			System.out.println("Entre com o nome: ");
			c.setNome(scan.nextLine());
			System.out.println("Entre com o telefone: ");
			c.setTelefone(scan.nextLine());
			System.out.println("Entre com o e-mail: ");
			c.setEmail(scan.nextLine());
			contatos[i] = c;
		}
		
		agenda.setContatos(contatos);
		
		if(agenda != null){
			System.out.println(agenda.obterInfo());
		}

	}

}
