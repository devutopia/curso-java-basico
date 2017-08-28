package com.kleber.javabasico.aula24.labs;

/**
 * Usando o resultado do modelo “Livro” como base, crie uma classe “LivroDeBiblioteca” 
 * que represente os dados básicos de um livro de uma biblioteca, que pode ser emprestado a leitores.
 * */

import java.util.Date;

public class LivroDeBiblioteca extends Livro {
	
	
	Date dataDeEmprestimo;
	Date dataEntrega;
	boolean emprestado;
	String nomeLocatario;
	

	
}