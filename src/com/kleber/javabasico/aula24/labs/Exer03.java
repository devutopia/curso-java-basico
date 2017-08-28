package com.kleber.javabasico.aula24.labs;

public class Exer03 {

	public static void main(String[] args) {
		
		LivroLivraria livro = new LivroLivraria();

		livro.nome = "As pupilas do senhor reitor";
		livro.categoria = "Romance";
		livro.autor = "Júlio Dinis";
		livro.qtdPaginas = 1000;
		livro.preco = 30.00;
		livro.qtd = 15;

		System.out.println(livro.nome);

		livro.nome = "Introdução ao Java";
		livro.categoria = "Educacional";
		livro.autor = "Kleber Lima";
		livro.qtdPaginas = 1150;
		livro.preco = 120.00;
		livro.qtd = 10;

		System.out.println(livro.nome);

	}

}
