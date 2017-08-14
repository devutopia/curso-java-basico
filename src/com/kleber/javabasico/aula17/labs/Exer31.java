package com.kleber.javabasico.aula17.labs;

import java.text.DecimalFormat;

/*Um funcionário de uma empresa recebe aumento salarial anualmente:
 * Sabe-se que:
 * . Esse funcionário foi contratado em 1995, com salário inicial de R$ 1.000,00;
 * a. Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
 * b. A partir de 1997 (inclusive), os aumentos salariais sempre correspondem ao 
 * dobro do percentual do ano anterior. Faça um programa que determine o salário 
 * atual desse funcionário. Após concluir isto, altere o programa permitindo que o usuário digite o
salário inicial do funcionário*/

public class Exer31 {

	public static void main(String[] args) {
		
		double salario = 1000; //95
		
		double percentual = 1.5;
		
		salario += (salario/100) * percentual; //96
		
		DecimalFormat format = new DecimalFormat("###,###.##");
		
		for (int i=1997; i <=2017; i++){
			
			percentual *= 2;
			
			salario += (salario/100) * percentual;
			
			System.out.println(i + " = " + format.format(salario) + " - " + percentual );
		}
	}

}
