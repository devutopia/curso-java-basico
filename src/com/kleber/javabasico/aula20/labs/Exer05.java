package com.kleber.javabasico.aula20.labs;

import java.util.Scanner;

/**Modifique o programa anterior de maneira a guardar os compromissos de todo o ano, 
 * organizados por mês, dia e hora (só 8 horas por dia)*/

public class Exer05 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		String[][][] compromissos = new String[12][31][24];
		
		boolean sair = false;
		byte opcao;
		while(!sair){
			
			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite 0 para sair.");
			
			opcao = scan.nextByte();
			
			if (opcao == 1) { //adicionar compromisso
				
				boolean mesValido = false;
				int mes=0;
				while (!mesValido){
					System.out.println("Entre com o mês.");
					mes = scan.nextInt();
					if (mes > 0 && mes <= 12){
						mesValido = true;
					} else {
						System.out.println("Mês inválido, digite novamente.");
					}
				}
		
				boolean diaValido = false;
				int dia=0;
				while (!diaValido){
					System.out.println("Entre com o dia do mês.");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31){
						diaValido = true;
					} else {
						System.out.println("Dia inválido, digite novamente.");
					}
				}
				
				boolean horaValido = false;
				int hora=0;
				while (!horaValido){
					System.out.println("Entre com a hora do compormisso.");
					hora = scan.nextInt();
					if (hora >= 0 && hora <= 8){
						horaValido = true;
					} else {
						System.out.println("Hora inválida, digite novamente.");
					}
				}
				
				mes--;
				dia--;
				System.out.println("Digite o compromisso:");
				compromissos[mes][dia][hora] = scan.next();
				
			} else if (opcao == 2){
				
				boolean mesValido = false;
				int mes=0;
				while (!mesValido){
					System.out.println("Entre com o mês.");
					mes = scan.nextInt();
					if (mes > 0 && mes <= 12){
						mesValido = true;
					} else {
						System.out.println("Mês inválido, digite novamente.");
					}
				}
				
				boolean diaValido = false;
				int dia=0;
				while (!diaValido){
					System.out.println("Entre com o dia do mês.");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31){
						diaValido = true;
					} else {
						System.out.println("Dia inválido, digite novamente.");
					}
				}
				
				boolean horaValido = false;
				int hora=0;
				while (!horaValido){
					System.out.println("Entre com a hora do compormisso.");
					hora = scan.nextInt();
					if (hora >= 0 && hora <= 8){
						horaValido = true;
					} else {
						System.out.println("Hora inválida, digite novamente.");
					}
				}
				
				mes--;
				dia--;
				System.out.println("O compromisso agendado é: ");
				System.out.println(compromissos[mes][dia][hora]);
				
			} else if (opcao == 0) {
				sair = true;
			} else {
				System.out.println("Opção inválida, digite novamente.");
			}	
		}
	}
}
