package com.kleber.javabasico.aula39.teste;

import com.kleber.javabasico.aula39.Pessoa;

public class Aluno extends Pessoa{

	private String curso;
	private String[][] notas;
	
	public void verificarAcesso(){
		this.nomeVisibilidade = "Nome";
		super.nomeVisibilidade = "nome2";
	}
	
	/**
	 * 
	 */
	public Aluno() {
		super();
	}

	/**
	 * @param nome
	 * @param endereco
	 * @param telefone
	 */
	public Aluno(String nome, String endereco, String telefone, String curso) {
		super(nome, endereco, telefone);
		this.curso = curso;
		
	}

	/**
	 * @return the cursos
	 */
	public String getCurso() {
		return curso;
	}

	/**
	 * @param cursos the cursos to set
	 */
	public void setCursos(String curso) {
		this.curso = curso;
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
	
	public void metodoQualquer(){
		super.setCpf("345345345354");
		
		this.setCpf("34534534");
	}

}
