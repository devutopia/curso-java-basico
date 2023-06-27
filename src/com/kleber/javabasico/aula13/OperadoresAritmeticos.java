package com.kleber.javabasico.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {

		int resultado = 1 + 2;
		System.out.println(resultado);

		resultado = resultado - 1;
		System.out.println(resultado);

		resultado = resultado * 2;
		System.out.println(resultado);

		resultado = resultado / 2;
		System.out.println(resultado);

		resultado = resultado + 8;
		System.out.println(resultado);

		resultado = resultado % 7;
		System.out.println(resultado); // resultado = 3

		String primeiroNome = "Esta é";
		String segundoNome = " uma String concatenada.";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);

		resultado = resultado + 1;
		System.out.println(resultado); // resultado = 4

		resultado++;
		System.out.println(resultado); // resultado = 5 + 1

		// 5
		System.out.println(resultado++);
		// mesma coisa que
		// resultado = resultado + 1;
		// resultado += 1;

		System.out.println(++resultado);
		// mesma coisa que somar antes de apresentar
		// resultado += 1;
		// System.out.println(resultado);

		resultado--;
		System.out.println(resultado);

		System.out.println(resultado--);
		// Mesma situação que anterior usando subtração.
		System.out.println(--resultado);

	}

}
