package com.kleber.javabasico.aula36.labs;

public class Aluno {
	private String nome;
	private String matricula;
	private double[] notas;
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
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
	 * @return the notas
	 */
	public double[] getNotas() {
		return notas;
	}
	/**
	 * @param notas the notas to set
	 */
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	public String obterInfo(){
		String info = "\nNome Aluno = " + nome + "; ";
		info += "Matricula = " + matricula + "; ";
		info += "Notas: ";
		
		double soma = 0;
		for (double nota : notas){
			soma += nota;
			info += nota + " | ";
		}
		double media = soma/4;
		info += "\n" + "Media = " + media + " - ";
		
		if (media >= 7){
			info += "Aprovado!";
		} else {
			info += "Reprovado!";
		}
		return info;
	}
	
	public double obterMedia(){
		double soma = 0;
		for (double nota : notas){
			soma += nota;
		}
		return soma / 4;
	}

}
