package com.kleber.javabasico.aula17.labs;

import java.util.Scanner;

/*O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende
implantar a metodologia da tabelinha, que já é um sucesso na sua loja
de 1,99. Você foi contratado para desenvolver o programa que monta
a tabela de preços de pães, de 1 até 50 pães, a partir do preço do pão
informado pelo usuário, conforme o exemplo abaixo:

- Preço do pão: R$ 0.18
- Panificadora Pão de Ontem - Tabela de preços
- 1 - R$ 0.18
- 2 - R$ 0.36
- ...
- 50 - R$ 9.00*/

public class Exer24 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Preço do pão: R$ 0.18");
		double preco = scan.nextDouble();
		
		System.out.println("Panificadora Pão de Ontem - Tabela de preços");
				
		for (int i = 1; i <= 50; i ++){
			System.out.println(i + "        -          R$ " + (i * preco));
			
		}


	}

}
