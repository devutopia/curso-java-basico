package com.kleber.javabasico.aula24.labs;

/**
 * Usando o resultado do exercício anterior como base, crie uma classe
 * “LivroDeLivraria” que represente os dados básicos de um livro que está à
 * venda em uma livraria.
 */

public class Exer02 {

	public static void main(String[] args) {

		Livro livro = new Livro();

		livro.nome = "As pupilas do senhor reitor";
		livro.categoria = "Romance";
		livro.autor = "Júlio Dinis";
		livro.qtdPaginas = 1000;

		System.out.println(livro.nome);

		livro.nome = "Introdução ao Java";
		livro.categoria = "Educacional";
		livro.autor = "Kleber Lima";
		livro.qtdPaginas = 1150;

		System.out.println(livro.nome);

	}

}
