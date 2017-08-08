package com.kleber.javabasico.aula15.labs;

import java.util.Scanner;

/*Uma fruteira está vendendo frutas com a seguinte tabela de preços:
Até 5 Kg Acima de 5 Kg
Morango R$ 2,50 por Kg R$ 2,20 por Kg
Maçã R$ 1,80 por Kg R$ 1,50 por Kg
Se o cliente comprar mais de 8 Kg em frutas ou o valor total da
compra ultrapassar R$ 25,00, receberá ainda um desconto de
10% sobre este total. Escreva um algoritmo para ler a
quantidade (em Kg) de morangos e a quantidade (em Kg) de
maças adquiridas e escreva o valor a ser pago pelo cliente.*/

public class Exer22 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Qtd de kg morango:");
		double kgMorango = scan.nextDouble();
		
		System.out.println("Qtd de kg maçã:");
		double kgMaca = scan.nextDouble();
		
		double precoMorango = 0;
		double precoMaca = 0;
		
		if (kgMorango <= 5){
			precoMorango = kgMorango * 2.5;
		}else{
			precoMorango = kgMorango * 2.2;
		}
				
		if (kgMaca <= 5){
			precoMaca = kgMaca * 1.8;
		}else{
			precoMaca = kgMaca * 1.5;
		}
		
		double valorParcial = precoMorango + precoMaca;
		double valorPagar = valorParcial;
		
		if ((kgMorango + kgMaca) > 8 || valorParcial > 25){
			valorPagar = valorParcial - ((valorParcial / 100) * 10);
		}
		
		System.out.println("Valor à pagar R$ " + valorPagar);
	}

}
