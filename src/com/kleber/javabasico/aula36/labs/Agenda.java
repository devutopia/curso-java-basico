package com.kleber.javabasico.aula36.labs;

public class Agenda {
	private String nomeAgenda;
	private Contato[] contatos;
	
	public Agenda(){
		
	}
	/**
	 * @param nomeAgenda
	 */
	public Agenda(String nomeAgenda) {
		super();
		this.nomeAgenda = nomeAgenda;
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
	
	public String obterInfo(){
		String info = "Nome = " + this.nomeAgenda + "\n";
		
		if (contatos != null){
			for (Contato c : contatos) {
				info += c.obterInfo() + "\n";
			}
		}
		return info;
	}
}
