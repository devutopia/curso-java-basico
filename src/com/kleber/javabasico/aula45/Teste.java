package com.kleber.javabasico.aula45;

public class Teste {

	public static void main(String[] args) {
		
		/*Aluno aluno = new Aluno();
		Pessoa alunoPessoa = aluno; //upcasting
		
		Pessoa aluno2 = (Pessoa) new Aluno();
		
		Pessoa aluno3 = new Pessoa();
		
		Aluno aluno4 = (Aluno) aluno3;*/
		
		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		if (pessoa instanceof Pessoa){
			System.out.println("Objeto do tipo Pessoa");
		}
		
		if (aluno instanceof Aluno){
			System.out.println("Objeto do tipo Aluno");
		}

		if (professor instanceof Professor){
			System.out.println("Objeto do tipo Professor");
		}


	}

}
