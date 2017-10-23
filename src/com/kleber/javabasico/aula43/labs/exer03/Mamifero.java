package com.kleber.javabasico.aula43.labs.exer03;

public class Mamifero extends Animal{

	private String alimento;
	
	public Mamifero(){
		super();
		this.setAmbiente("Terra");
		this.setCor("Castanho");
		this.alimento = "Mel";
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		s += "\nAlimento: " + getAlimento();
		return s;
	}
}
