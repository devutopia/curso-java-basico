package com.kleber.javabasico.aula17.labs;

import java.util.Scanner;

/*O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende
implantar a metodologia da tabelinha, que j� � um sucesso na sua loja
de 1,99. Voc� foi contratado para desenvolver o programa que monta
a tabela de pre�os de p�es, de 1 at� 50 p�es, a partir do pre�o do p�o
informado pelo usu�rio, conforme o exemplo abaixo:

- Pre�o do p�o: R$ 0.18
- Panificadora P�o de Ontem - Tabela de pre�os
- 1 - R$ 0.18
- 2 - R$ 0.36
- ...
- 50 - R$ 9.00*/

public class Exer24 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Pre�o do p�o: R$ 0.18");
		double preco = scan.nextDouble();
		
		System.out.println("Panificadora P�o de Ontem - Tabela de pre�os");
				
		for (int i = 1; i <= 50; i ++){
			System.out.println(i + "        -          R$ " + (i * preco));
			
		}


	}

}
