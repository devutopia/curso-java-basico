package com.kleber.javabasico.aula37;

public class Aluno extends Pessoa{

	private String[] cursos;
	private String[][] notas;
	
	public Aluno() {
	}

	/**
	 * @return the cursos
	 */
	public String[] getCursos() {
		return cursos;
	}

	/**
	 * @param cursos the cursos to set
	 */
	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}

	/**
	 * @return the notas
	 */
	public String[][] getNotas() {
		return notas;
	}

	/**
	 * @param notas the notas to set
	 */
	public void setNotas(String[][] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia(){
		return 0;
	}
	
	public boolean verificarAprovado(){
		return true;
	}

}
