package com.kleber.javabasico.aula52.labs;

@SuppressWarnings("serial")
public class AgendaCheiaException extends Exception {
	
	@Override
	public String getMessage() {
		return "Agenda já está cheia";
	}
}
