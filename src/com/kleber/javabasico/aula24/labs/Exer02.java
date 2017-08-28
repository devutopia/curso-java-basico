package com.kleber.javabasico.aula24.labs;

/**
 * Usando o resultado do exerc�cio anterior como base, crie uma classe
 * �LivroDeLivraria� que represente os dados b�sicos de um livro que est� �
 * venda em uma livraria.
 */

public class Exer02 {

	public static void main(String[] args) {

		Livro livro = new Livro();

		livro.nome = "As pupilas do senhor reitor";
		livro.categoria = "Romance";
		livro.autor = "J�lio Dinis";
		livro.qtdPaginas = 1000;

		System.out.println(livro.nome);

		livro.nome = "Introdu��o ao Java";
		livro.categoria = "Educacional";
		livro.autor = "Kleber Lima";
		livro.qtdPaginas = 1150;

		System.out.println(livro.nome);

	}

}
