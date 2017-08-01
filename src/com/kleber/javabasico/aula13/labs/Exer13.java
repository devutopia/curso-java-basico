package com.kleber.javabasico.aula13.labs;

import java.util.Scanner;

public class Exer13 {
	
	/*Fa�a um Programa que pergunte quanto voc� ganha por hora e o
	n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu
	sal�rio no referido m�s, sabendo-se que s�o descontados 11% para o
	Imposto de Renda, 8% para o inss e 5% para o sindicato, fa�a um
	programa que nos d�:
	. sal�rio bruto.
	a. quanto pagou ao inss.
	b. quanto pagou ao sindicato.
	c. o sal�rio l�quido.
	d. calcule os descontos e o sal�rio l�quido, conforme a tabela
	abaixo:
	+ Sal�rio Bruto : R$ - IR (11%) : R$ - inss
	(8%) : R$ - Sindicato ( 5%) : R$ = Sal�rio
	Liquido : R$
	Obs.: Sal�rio Bruto - Descontos = Sal�rio L�quido.*/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o valor/hora trabalhada?");
		double valorHora = scan.nextDouble();
		
		System.out.println("Quantas horas vc trabalha no m�s? ");
		double horasTrabalhadas = scan.nextDouble();
		
		double salarioBruto = valorHora * horasTrabalhadas;
		double impostoDeRenda = salarioBruto * 0.11;
		double inss = salarioBruto * 0.08;
		double sindicato = salarioBruto * 0.05;
		double totalDescontos = impostoDeRenda + inss + sindicato;
		double salarioLiquido = salarioBruto - totalDescontos; 
		
		System.out.println("Sal�rio bruto mensal: " + salarioBruto);
		System.out.println("IRFF do m�s: " + impostoDeRenda);
		System.out.println("inss: " + inss);
		System.out.println("Taxa do sindicato: " + sindicato);
		System.out.println("Total de descontos: " + totalDescontos);
		System.out.println("Sal�rio l�quido mensal: " + salarioLiquido);
		
		//ok
	}

}
