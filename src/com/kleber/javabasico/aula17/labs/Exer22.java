package com.kleber.javabasico.aula17.labs;

import java.util.Scanner;

/*Fa�a um programa que calcule o valor total investido por um
colecionador em sua cole��o de CDs e o valor m�dio gasto em cada
um deles. O usu�rio dever� informar a quantidade de CDs e o valor
para cada um.*/

public class Exer22 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidades de CDs:");
		int qtdCD = scan.nextInt();

		double valor;
		double valorTotal = 0;
				
		for (int i = 1; i <= qtdCD; i++){
			
			System.out.println("Informe o valor do CD " + i);
			valor = scan.nextDouble();
			valorTotal += valor;
		}
		
		double media = valorTotal / qtdCD;
		
		System.out.println("Valor total da cole��o: " + valorTotal);
		System.out.println("Valor m�dio dos CD's  : " + media);

	}

}
