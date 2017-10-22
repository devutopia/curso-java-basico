package com.kleber.javabasico.aula43;

import java.util.Arrays;

public class Aluno {

	private String curso;
	private double[] notas;
	
	
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
		//super(nome, endereco, telefone);
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
	public double[] getNotas() {
		return notas;
	}

	/**
	 * @param notas2 the notas to set
	 */
	public void setNotas(double[] notas2) {
		this.notas = notas2;
	}
	
	public double calcularMedia(){
		return 0;
	}
	
	public boolean verificarAprovado(){
		return true;
	}
	
	public void metodoQualquer(){
		//super.setCpf("345345345354");
		
		//this.setCpf("34534534");
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}
	
	/*@Override
	public String obterEtiquetaEndereco() {
		String s = "Endereço do Aluno: ";
		s += super.getEndereco();
		return s;
	}

	@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println(this.obterEtiquetaEndereco());
		
	}*/
	
	/*public String toString(){
		String s = curso + "\n";
		for (double nota : notas){
			s += nota + " ";
		}
		return s;
	}*/
	
	

}
