package com.kleber.javabasico.aula13.labs;

import java.util.Scanner;

public class Exer13 {
	
	/*Faça um Programa que pergunte quanto você ganha por hora e o
	número de horas trabalhadas no mês. Calcule e mostre o total do seu
	salário no referido mês, sabendo-se que são descontados 11% para o
	Imposto de Renda, 8% para o inss e 5% para o sindicato, faça um
	programa que nos dê:
	. salário bruto.
	a. quanto pagou ao inss.
	b. quanto pagou ao sindicato.
	c. o salário líquido.
	d. calcule os descontos e o salário líquido, conforme a tabela
	abaixo:
	+ Salário Bruto : R$ - IR (11%) : R$ - inss
	(8%) : R$ - Sindicato ( 5%) : R$ = Salário
	Liquido : R$
	Obs.: Salário Bruto - Descontos = Salário Líquido.*/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o valor/hora trabalhada?");
		double valorHora = scan.nextDouble();
		
		System.out.println("Quantas horas vc trabalha no mês? ");
		double horasTrabalhadas = scan.nextDouble();
		
		double salarioBruto = valorHora * horasTrabalhadas;
		double impostoDeRenda = salarioBruto * 0.11;
		double inss = salarioBruto * 0.08;
		double sindicato = salarioBruto * 0.05;
		double totalDescontos = impostoDeRenda + inss + sindicato;
		double salarioLiquido = salarioBruto - totalDescontos; 
		
		System.out.println("Salário bruto mensal: " + salarioBruto);
		System.out.println("IRFF do mês: " + impostoDeRenda);
		System.out.println("inss: " + inss);
		System.out.println("Taxa do sindicato: " + sindicato);
		System.out.println("Total de descontos: " + totalDescontos);
		System.out.println("Salário líquido mensal: " + salarioLiquido);
		
		//ok
	}

}
