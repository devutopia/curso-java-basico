package com.kleber.javabasico.aula52.labs;

public class Contato {
	
	private static int contador = 0;
	
	private int id;
	private String nome;
	private String telefone;
	private String email;
	
	public Contato() {
		contador++;
		this.id = contador;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

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
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}


	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String s = "[Id: " + id;
		s += "; Nome: " + nome;
		s += "; Telefone: " + telefone;
		s += "; Email: " + email + "]";
		
		return s;
	}
	
	

}
