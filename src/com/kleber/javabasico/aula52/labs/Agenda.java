package com.kleber.javabasico.aula52.labs;

import com.kleber.javabasico.aula52.labs.Contato;

public class Agenda {
	
	private Contato[] contatos;
	
	public Agenda() {
		contatos = new Contato[5];
	}
	
	public void adicionarContato(Contato c) throws AgendaCheiaException {
		
		boolean cheia = true;
		for(int i=0; i<contatos.length; i++){
			if (contatos[i] == null){
				contatos[i] = c;
				cheia = false;
				break;
			}
		}
	}

}
