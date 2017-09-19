package com.kleber.javabasico.aula33.labs;

import java.util.Scanner;

public class Exer03 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		scan = new Scanner(System.in);
		
		System.out.println("Entre com o nome do aluno: ");
		aluno.setNomeAluno(scan.next()); 
		
		System.out.println("Entre com o nome do curso: ");
		aluno.setNomeCurso(scan.next());
		
		System.out.println("Entre com a matrícula: ");
		aluno.setMatricula(scan.next());
		
		for (int i=0; i<aluno.getNomeDisciplinas().length; i++){
			System.out.println("Entre com o nome da disciplina " + (i+1) + ":");
			aluno.setNomeDisciplinaPos(i, scan.next());
		}
		
		for (int i=0; i<aluno.getNotasDisciplinas().length; i++){
			System.out.println("Obtendo notas da disciplina " + aluno.getNomeDisciplinas()[i]);
			for (int j=0; j<aluno.getNotasDisciplinas()[i].length; j++){
				System.out.println("Entre com a nota " + (j+1) + ":");
				aluno.setNotaDisciplinaPosIJ(i, j, scan.nextDouble());
			}
		}
		
		aluno.mostrarInfo();
		
		for (int i=0; i<aluno.getNotasDisciplinas().length; i++){
            if (aluno.verificarAprovado(i)){
                System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " - foi aprovado");
            } else {
                System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " - reprovado");
            }
        }
	}

}
