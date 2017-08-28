package com.kleber.javabasico.aula24.labs;

import java.util.Date;

public class Exer04 {

	public static void main(String[] args) {
		
		LivroDeBiblioteca livro = new LivroDeBiblioteca();
		
		livro.nome = "Livro1";
		livro.autor = "autor1";
		livro.edicao = "5ª edição";
		livro.emprestado = true;
		livro.dataEntrega = new Date();
		livro.nomeLocatario = "Kleber";
		
		System.out.println(livro.nome);
		System.out.println(livro.autor);
		System.out.println(livro.edicao);
		System.out.println(livro.emprestado);
		System.out.println();
		
		livro.nome = "Livro2";
		livro.autor = "autor2";
		livro.edicao = "1ª edição";
		livro.emprestado = false;
		
		System.out.println(livro.nome);
		System.out.println(livro.autor);
		System.out.println(livro.edicao);
		System.out.println(livro.emprestado);

	}

}
