package com.kleber.javabasico.aula52.labs;

import com.kleber.javabasico.aula52.labs.Contato;

public class Agenda {
	
	private Contato[] contatos;
	
	public Agenda() {
		contatos = new Contato[5];
	}

	/**
	 * @return the nomeAgenda
	 */
	public String getNomeAgenda() {
		return nomeAgenda;
	}

	/**
	 * @param nomeAgenda the nomeAgenda to set
	 */
	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}

	/**
	 * @return the contatos
	 */
	public Contato[] getContatos() {
		return contatos;
	}

	/**
	 * @param contatos the contatos to set
	 */
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	
	public void adicionarContato(){
		
	}

}
