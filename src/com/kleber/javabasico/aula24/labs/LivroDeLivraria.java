package com.kleber.javabasico.aula24.labs;

public class LivroDeLivraria {

	public static void main(String[] args) {
		
		
		Livro livro = new Livro();
		
		livro.nome = "As pupilas do senhor reitor";
		livro.categoria = "Romance";
		livro.autor = "J�lio Dinis";
		livro.preco = 30.00;
		livro.qtdPaginas = 1000;
		
		System.out.println(livro.nome);
		
		livro.nome = "Introdu��o ao Java";
		livro.categoria = "Educacional";
		livro.autor = "Kleber Lima";
		livro.preco = 150.00;
		livro.qtdPaginas = 1150;
		
		System.out.println(livro.nome);

	}

}
