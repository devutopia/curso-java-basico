package com.kleber.javabasico.aula52.labs;

@SuppressWarnings("serial")
public class ContatoNaoExisteException extends Exception{

	private String nomeContato;
	
	public ContatoNaoExisteException(String nomeContato){
		this.nomeContato = nomeContato;
	}
	
	@Override
	public String getMessage() {
		return "Contato " + nomeContato + " não existe na agenda!\n";
	}
}
