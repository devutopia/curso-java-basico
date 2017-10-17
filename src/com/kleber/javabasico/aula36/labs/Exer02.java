package com.kleber.javabasico.aula36.labs;

import java.util.Scanner;

public class Exer02 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Entre com o nome do curso:");
		String nome = scan.nextLine();
		
		System.out.println("Entre com o horario do curso:");
		String horario = scan.nextLine();
		
		System.out.println("Entre com o nome do professor: ");
		String nomeProf = scan.nextLine();
		
		System.out.println("Entre com o departamento do professor: ");
		String depProf= scan.nextLine();
		
		System.out.println("Entre com o email do professor: ");
		String emailProf = scan.nextLine();

		Curso curso = new Curso();
		curso.setNomeCurso(nome);
		curso.setHorario(horario);
		
		Professor professor = new Professor();
		professor.setNome(nomeProf);
		professor.setDepartamento(depProf);
		professor.setEmail(emailProf);
		
		curso.setProfessor(professor);
		
		System.out.println("---Alunos---");
		
		Aluno[] alunos = new Aluno[2];
		for (int i=0; i<2; i++){
			
			scan.nextLine();
			
			System.out.println("Entre com o nome do aluno " + (i + 1));
			String nomeAluno = scan.nextLine();
			
			System.out.println("Entre com a matricula do aluno " + (i + 1));
			String matricula = scan.nextLine();
			
			double[] notas = new double[4];
			
			for (int j=0; j<4; j++){
				System.out.println("Entre com a nota " + (j + 1) + " do aluno " + (i + 1));
				notas[j] = scan.nextDouble();
			}
			
			Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matricula);
			aluno.setNotas(notas);
			alunos[i] = aluno;
		}
		curso.setAlunos(alunos);
		
		System.out.println(curso.obterInfo());
	}

}
