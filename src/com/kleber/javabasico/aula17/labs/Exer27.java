package com.kleber.javabasico.aula17.labs;

import java.util.Scanner;

/*O Departamento Estadual de Meteorologia lhe contratou para
desenvolver um programa que leia as um conjunto indeterminado de
temperaturas, e informe ao final a menor e a maior temperaturas
informadas, bem como a média das temperaturas.*/

public class Exer27 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de temperaturas:");
		int qtdTemperaturas = scan.nextInt();
		
		double temp;
		double soma = 0;
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;
		
		
		for (int i = 1; i <=qtdTemperaturas; i++){
			
			System.out.println("Informe a temperatura nº " + i);
			temp = scan.nextDouble();
			
			soma += temp;
			
			if (temp > maior){
				maior = temp;
			}
			
			if (temp < menor){
				menor = temp;
				
			}
		}
		System.out.println("Média: " + (soma / qtdTemperaturas));
		System.out.println("Menor temperatura: " + menor);
		System.out.println("Maior temperatura: " + maior);
	}

}
