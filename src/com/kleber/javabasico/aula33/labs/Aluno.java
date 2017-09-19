package com.kleber.javabasico.aula33.labs;

public class Aluno {
	
	private String nomeAluno;
	private String matricula;
	private String nomeCurso;
	private String[] nomeDisciplinas;
	private double[][] notasDisciplinas;
	
	public Aluno() {
		this.nomeDisciplinas = new String[3];
		this.notasDisciplinas = new double[3][4];
	}
	
	public Aluno(String nomeAluno, String matricula, String nomeCurso, String[] nomeDisciplinas,
			double[][] notasDisciplinas) {
		this.nomeAluno = nomeAluno;
		this.matricula = matricula;
		this.nomeCurso = nomeCurso;
		this.nomeDisciplinas = new String[3];
		this.notasDisciplinas = new double[3][4];
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
	
	public void mostrarInfo(){
		System.out.println("Nome: " + this.nomeAluno);
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("Curso: " + this.nomeCurso);
		
		for (int i=0; i < this.notasDisciplinas.length; i++){
			System.out.println("Notas da disciplina " + this.nomeDisciplinas[i]);
			for (int j=0; j < this.notasDisciplinas[i].length; j++){
				System.out.print(this.notasDisciplinas[i][j] + " | ");
			}
			System.out.println();
		}
	}
	
	public boolean verificarAprovado(int indice){
		if (obterMedia(indice) >=7){
			return true;
		}
		return false;
	}
	
	public double obterMedia (int indice){
		double soma=0;
		
		for(int i=0; i<this.notasDisciplinas[indice].length; i++){
			soma += this.notasDisciplinas[indice][i];
		}
		
		double media = soma / 4;
		
		return media;
		
	}
	
	public void setNomeDisciplinaPos(int pos, String nomeDisciplina){
		this.nomeDisciplinas[pos] = nomeDisciplina;
	}
	
	public void setNotaDisciplinaPosIJ (int posI, int posJ, double nota){
		this.notasDisciplinas[posI][posJ] = nota;
	}


}
