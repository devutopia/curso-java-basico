package com.kleber.javabasico.aula34.labs;

public class Exer01 {
	
	static void imprimirValor(){
		System.out.println(Contador.obterValor());
	}

	public static void main(String[] args) {
		
		
		imprimirValor();
		
		Contador c1 = new Contador();
		
		imprimirValor();
		
		c1.zerar();
		
		Contador.incrementar();
		
		imprimirValor();
		
		c1.zerar();
		
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		
		imprimirValor();
		
		Contador c2 = new Contador();
		Contador c3 = new Contador();
		
		imprimirValor();
		
	}

}
