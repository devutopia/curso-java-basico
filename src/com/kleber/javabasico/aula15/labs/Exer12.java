package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

/*Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são 
do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato 
e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita).
O Salário Liquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao 
usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
Desconto do IR:
Salário Bruto até 1903.98 (inclusive) - isento
Salário Bruto até 2826.65 (inclusive) - desconto de 7.5%
Salário Bruto até 3751.05 (inclusive) - desconto de 15%
Salário Bruto até 4664.68 (inclusive) - desconto de 22.5
Salário Bruto acima de 4664.68 - desconto de 27.5% 
Imprima na tela as informações, dispostas conforme o exemplo abaixo. 
No exemplo o valor da hora é 23.65 e a quantidade de hora é 176*/

public class Exer12 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		System.out.println("Qual o valor/hora trabalhada?");
		double valorHora = scan.nextDouble();

		System.out.println("Quantas horas vc trabalha no Salário? ");
		double qtdHoras = scan.nextDouble();

		double salarioBruto = valorHora * qtdHoras;
		double percentualIR = 0;

		if (salarioBruto <= 1903.98) {
			percentualIR = 0;
		} else if (salarioBruto > 1903.98 && salarioBruto <= 2826.65) {
			percentualIR = 7.5;
		} else if (salarioBruto > 2826.65 && salarioBruto <= 3751.05) {
			percentualIR = 15;
		} else if (salarioBruto > 3751.05 && salarioBruto <= 4664.68) {
			percentualIR = 22.5;
		} else if (salarioBruto > 4664.68) {
			percentualIR = 27.5;
		}

		double ir = (salarioBruto / 100) * percentualIR;
		double inss = (salarioBruto / 100) * 10;
		double sindicato = (salarioBruto / 100 * 3);
		double fgts = (salarioBruto / 100) * 11;
		double totalDescontos = ir + inss;
		double salarioLiquido = salarioBruto - totalDescontos;

		System.out.println("Salário bruto: " + "(" + valorHora + " * " + qtdHoras + ")" +
				":R$ " + salarioBruto);
		System.out.println("(-) IR (" + percentualIR + "%) : R$ " + ir);
		System.out.println("(-) INSS (11%) : R$ " + inss);
		System.out.println("Sindicato (3%) : R$ " + sindicato);
		System.out.println("FGTS (10%) : R$ " + fgts);
		System.out.println("Total de descontos : R$ " + totalDescontos);
		System.out.println("Salário líquido : R$ " + salarioLiquido);
	}
}
