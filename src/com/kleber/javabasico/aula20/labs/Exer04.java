package com.kleber.javabasico.aula20.labs;

import java.util.Scanner;

/**Fa�a um programa para armazenar em uma matriz os compromissos de uma agenda pessoal.
 * Cada dia do m�s deve conter 24 horas, onde para cada uma destas 24 horas podemos associar um tarefa espec�fica 
 * (compromisso agendado). O programa deve ter um menu onde o usu�rio indica o dia do m�s que deseja alterar e a hora,
 *  entrando em seguida com o compromisso, ou ent�o, o usu�rio pode tamb�m consultar a agenda, 
 *  fornecendo o dia e a hora para obter o compromisso armazenado*/

public class Exer04 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		String[][] compromissos = new String[31][24];
		
		boolean sair = false;
		byte opcao;
		while(!sair){
			
			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite 0 para sair.");
			
			opcao = scan.nextByte();
			
			if (opcao == 1) { //adicionar compromisso
				
				boolean diaValido = false;
				int dia=0;
				while (!diaValido){
					System.out.println("Entre com o dia do m�s.");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31){
						diaValido = true;
					} else {
						System.out.println("Dia inv�lido, digite novamente.");
					}
				}
				
				boolean horaValido = false;
				int hora=0;
				while (!horaValido){
					System.out.println("Entre com a hora do compormisso.");
					hora = scan.nextInt();
					if (hora >= 0 && hora <= 24){
						horaValido = true;
					} else {
						System.out.println("Hora inv�lida, digite novamente.");
					}
				}
				
				dia--;
				System.out.println("Digite o compromisso:");
				compromissos[dia][hora] = scan.next();
				
			} else if (opcao == 2){
				
				boolean diaValido = false;
				int dia=0;
				while (!diaValido){
					System.out.println("Entre com o dia do m�s.");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31){
						diaValido = true;
					} else {
						System.out.println("Dia inv�lido, digite novamente.");
					}
				}
				
				boolean horaValido = false;
				int hora=0;
				while (!horaValido){
					System.out.println("Entre com a hora do compormisso.");
					hora = scan.nextInt();
					if (hora >= 0 && hora <= 24){
						horaValido = true;
					} else {
						System.out.println("Hora inv�lida, digite novamente.");
					}
				}
				
				dia--;
				System.out.println("O compromisso agendado �: ");
				System.out.println(compromissos[dia][hora]);
				
			} else if (opcao == 0) {
				sair = true;
			} else {
				System.out.println("Op��o inv�lida, digite novamente.");
			}	
		}
	}
}
