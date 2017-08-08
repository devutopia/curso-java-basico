package com.kleber.javabasico.aula15.labs;

/*Um posto está vendendo combustíveis com a seguinte tabela de
descontos:
	
Álcool:
	
a. até 20 litros, desconto de 3% por litro
b. acima de 20 litros, desconto de 5% por litro

Gasolina:
	
c. até 20 litros, desconto de 4% por litro
d. acima de 20 litros, desconto de 6% por litro 

Escreva um algoritmo que leia o número de litros vendidos, o tipo de
combustível (codificado da seguinte forma: A-álcool, G-gasolina),
calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço
do litro do álcool é R$ 1,90.*/

import java.util.Scanner;

public class Exer21 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Quantidade de litros:");
		double litros = scan.nextDouble();
		
		System.out.println("Tipo de combustível: A-álcool / G-gasolina");
		String tipo = scan.next();
		
		double precoGasolina = 2.50;
		double precoAlcool = 1.90;
		int percDesconto = 0;
		double total = 0;
		double totalDesc = 0;
		
		if(tipo.equalsIgnoreCase("a")){
			if(litros <=20){
				percDesconto =3;
			} else {
				percDesconto =5;
			}
			
			total = litros * precoAlcool;
			
		} else if (tipo.equalsIgnoreCase("g")){
			if(litros <=20){
				percDesconto =4;
			} else {
				percDesconto =6;
			}
			
			total = litros * precoGasolina;
					
		}
		
		totalDesc = (total /100) * percDesconto;
		
		double precoPagar = total - totalDesc;
		
		System.out.println("Valor a ser pago: " + precoPagar);

	}
}
