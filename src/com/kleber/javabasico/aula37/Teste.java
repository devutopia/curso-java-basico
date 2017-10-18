package com.kleber.javabasico.aula37;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.getNome(); //herdou da classe Pessoa
		
		Professor professor = new Professor();
		
		professor.setEndereco("Rua Tranquila"); //herdou da classe Pessoa
		professor.setTelefoneCelular("5555555");
		
		Pessoa aluno2 = new Aluno(); //Declarado como tipo da classe pai, mas não herda atributos da classe filha
		
		//aluno2.getNotas //????
		
		aluno2.setCpf("222222222222");
		

	}

}
