package com.kleber.javabasico.aula27.labs;

public class Aluno {
	
	String nome;
	String matricula;
	String nomeCurso;
	String[] nomeDisciplinas;
	double[][] notasDisciplinas;
	
	void mostrarInfo(){
		System.out.println("Nome: " + nome);
		System.out.println("Matrícula: " + matricula);
		System.out.println("Curso: " + nomeCurso);
		
		for (int i=0; i < notasDisciplinas.length; i++){
			System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
			for (int j=0; j < notasDisciplinas[i].length; j++){
				System.out.println(notasDisciplinas[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	void verificarAprovado (){
		
	}
	

}
