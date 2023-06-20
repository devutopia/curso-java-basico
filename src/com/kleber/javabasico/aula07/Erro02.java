package com.kleber.javabasico.aula07;

public class Erro02 {
	public static void main(String[] args) {
		// Irá gerar um erro de semântica por nâo ter iniciado a variavel
		// Não compila, pois é um erro de semãntica.
		int cont = 0;

		System.out.println("Você digitou:" + cont);
	}
}