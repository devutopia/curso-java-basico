package com.kleber.javabasico.aula24.labs;

public class LivroDeBiblioteca {

	public static void main(String[] args) {
		
		Livro livroDeBiblioteca = new Livro();
		
		livroDeBiblioteca.nome = "Livro1";
		livroDeBiblioteca.autor = "autor1";
		livroDeBiblioteca.edicao = "5ª edição";
		livroDeBiblioteca.emprestado = true;
		
		System.out.println(livroDeBiblioteca.nome);
		System.out.println(livroDeBiblioteca.autor);
		System.out.println(livroDeBiblioteca.edicao);
		System.out.println(livroDeBiblioteca.emprestado);
		System.out.println();
		
		livroDeBiblioteca.nome = "Livro2";
		livroDeBiblioteca.autor = "autor2";
		livroDeBiblioteca.edicao = "1ª edição";
		livroDeBiblioteca.emprestado = false;
		
		System.out.println(livroDeBiblioteca.nome);
		System.out.println(livroDeBiblioteca.autor);
		System.out.println(livroDeBiblioteca.edicao);
		System.out.println(livroDeBiblioteca.emprestado);
	}

}