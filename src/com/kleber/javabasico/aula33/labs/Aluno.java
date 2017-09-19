package com.kleber.javabasico.aula33.labs;

public class Aluno {
	
	private String nomeAluno;
	private String matricula;
	private String nomeCurso;
	private String[] nomeDisciplinas;
	private double[][] notasDisciplinas;
	
	public Aluno() {
	}
	
	public Aluno(String nomeAluno, String matricula, String nomeCurso, String[] nomeDisciplinas,
			double[][] notasDisciplinas) {
		this.nomeAluno = nomeAluno;
		this.matricula = matricula;
		this.nomeCurso = nomeCurso;
		this.nomeDisciplinas = nomeDisciplinas;
		this.notasDisciplinas = notasDisciplinas;
	}

	/**
	 * @return the nomeAluno
	 */
	public String getNomeAluno() {
		return nomeAluno;
	}

	/**
	 * @param nomeAluno the nomeAluno to set
	 */
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

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
	 * @return the nomeDisciplinas
	 */
	public String[] getNomeDisciplinas() {
		return nomeDisciplinas;
	}

	/**
	 * @param nomeDisciplinas the nomeDisciplinas to set
	 */
	public void setNomeDisciplinas(String[] nomeDisciplinas) {
		this.nomeDisciplinas = nomeDisciplinas;
	}

	/**
	 * @return the notasDisciplinas
	 */
	public double[][] getNotasDisciplinas() {
		return notasDisciplinas;
	}

	/**
	 * @param notasDisciplinas the notasDisciplinas to set
	 */
	public void setNotasDisciplinas(double[][] notasDisciplinas) {
		this.notasDisciplinas = notasDisciplinas;
	}


}
