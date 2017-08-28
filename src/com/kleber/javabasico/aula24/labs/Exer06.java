package com.kleber.javabasico.aula24.labs;

public class Exer06 {

	public static void main(String[] args) {
		
		AgendaDeContatos contato1  = new AgendaDeContatos();
		contato1.nome = "João";
		contato1.endereco = "Av. Ibirapuera, 3161";
		contato1.email = "joao@email.com";
		
		contato1.telefones = new String[5];
		contato1.telefones[0] = "99999-9999";
		contato1.telefones[1] = "99999-9998";
		contato1.telefones[2] = "99999-9997";
	}

}
