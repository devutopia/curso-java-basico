package com.kleber.javabasico.aula42;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		//Pessoa aluno = new Aluno();
		//Pessoa professor = new Professor();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		//Exemplo do final
		System.out.println(Constantes.URL_FACEBOOK);
		//Constantes.URL_FACEBOOK="assdfasfafasdfa"; atributo do tipo final não pode ser modificado.
	}
}
