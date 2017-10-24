package com.kleber.javabasico.aula45;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		Pessoa pessoaAluno = aluno; //upcasting
		
		Pessoa aluno2 = (Pessoa) new Aluno();
		

	}

}
