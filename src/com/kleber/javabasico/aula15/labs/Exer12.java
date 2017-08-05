package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

/*Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do 
salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado 
(é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o
valor da sua hora e a quantidade de horas trabalhadas no mês.
Desconto do IR:
Salário Bruto até 900 (inclusive) - isento
Salário Bruto até 1500 (inclusive) - desconto de 5%
Salário Bruto até 2500 (inclusive) - desconto de 10%
Salário Bruto acima de 2500 - desconto de 20% 
Imprima na tela as informações, dispostas conforme o exemplo abaixo. 
No exemplo o valor da hora é 5 e a quantidade de hora é 220*/

public class Exer12 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Qual o valor/hora trabalhada?");
		double valorHora = scan.nextDouble();
		
		System.out.println("Quantas horas vc trabalha no mês? ");
		double qtdHoras = scan.nextDouble();
		
		double salarioBruto = valorHora * qtdHoras;
		int percentualIR = 0;
		
		if (salarioBruto <= 900){
			percentualIR = 0;
		} else if (salarioBruto > 900 && salarioBruto <= 1500){
			percentualIR = 5;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500){
			percentualIR = 10;
		} else if (salarioBruto > 2500){
			percentualIR = 20;			
		}
		
		double ir = (salarioBruto/100) * percentualIR;
		double inss = (salarioBruto / 100) * 10;
		double fgts = (salarioBruto / 100) * 11;
		double totalDescontos = ir + inss;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salário bruto: " + "(" + valorHora + " * " + qtdHoras + ")" + ":R$ " + salarioBruto);
		System.out.println("(-) IR ("+ percentualIR +"%) : R$ " + ir);
		System.out.println("(-) INSS (11%) : R$ " + inss);
		System.out.println("FGTS (10%) : R$ " + fgts);
		System.out.println("Total de descontos : R$ " + totalDescontos);
		System.out.println("Salário líquido : R$ " + salarioLiquido);

	}

}
