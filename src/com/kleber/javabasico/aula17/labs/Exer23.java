package com.kleber.javabasico.aula17.labs;

/*O Sr. Manoel Joaquim possui uma grande loja de artigos de R$ 1,99,
com cerca de 10 caixas. Para agilizar o c�lculo de quanto cada cliente
deve pagar ele desenvolveu um tabela que cont�m o n�mero de itens
que o cliente comprou e ao lado o valor da conta. Desta forma a
atendente do caixa precisa apenas contar quantos itens o cliente est�
levando e olhar na tabela de pre�os. Voc� foi contratado para
desenvolver o programa que monta esta tabela de pre�os, que conter�
os pre�os de 1 at� 50 produtos, conforme o exemplo abaixo:
- Lojas Quase Dois - Tabela de pre�os
- 1 - R$ 1.99
- 2 - R$ 3.98
- ...
- 50 - R$ 99.50*/

public class Exer23 {

	public static void main(String[] args) {
		
		System.out.println("LOJA QUASE DOIS - Tabela de Pre�os");
		
		for (int i = 1; i <= 50; i ++){
			System.out.println(i + "        -          R$ " + (1.99 * i));
		}
	}
}