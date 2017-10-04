package com.kleber.javabasico.aula36;

public class Contato {

	private String nome;
	private Endereco endereco;
	private Telefone[] telefones;
	
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
	 * @return the endereco
	 */
	public Endereco getEndereco() {
		return endereco;
	}
	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}	
	/**
	 * @return the telefones
	 */
	public Telefone[] getTelefones() {
		return telefones;
	}
	/**
	 * @param telefones the telefones to set
	 */
	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}
}
