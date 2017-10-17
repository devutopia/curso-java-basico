package com.kleber.javabasico.aula36.labs;

public class Curso {
	private String nomeCurso;
	private String horario;
	private Professor professor;
	private Aluno[] alunos;
	
	/**
	 * @return the nomeCurso
	 */
	public String getNomeCurso() {
		return nomeCurso;
	}
	/**
	 * @param nomeCurso the nomeCurso to set
	 */
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	/**
	 * @return the horario
	 */
	public String getHorario() {
		return horario;
	}
	/**
	 * @param horario the horario to set
	 */
	public void setHorario(String horario) {
		this.horario = horario;
	}
	/**
	 * @return the professor
	 */
	public Professor getProfessor() {
		return professor;
	}
	/**
	 * @param professor the professor to set
	 */
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	/**
	 * @return the alunos
	 */
	public Aluno[] getAlunos() {
		return alunos;
	}
	/**
	 * @param alunos the alunos to set
	 */
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	public String obterInfo(){
		String info = "Nome do Curso = " + nomeCurso + "\n";
		
		if(professor != null){
			info += professor.obterInfo();
		}
		
		if(alunos != null){
			System.out.println("---Alunos---");
			for (Aluno aluno : alunos){
				if (aluno != null){
					info += aluno.obterInfo();
					info += "\n";
				}
			}
			
			info += "\nMedia da turma = " + obterMediaTurma();
		}
		
		return info;
	}
	
	public double obterMediaTurma(){
		double soma = 0;
		for (Aluno aluno : alunos){
			if (aluno != null){
				soma += aluno.obterMedia();	
			}
		}
		return soma/alunos.length;
	}
}
