package com.kleber.javabasico.aula34.labs;

public class Exer02 {
	
	static void imprimirTela(double num) {
		System.out.println(num);
	}

	public static void main(String[] args) {
		
		imprimirTela(Calculadora.somar(3, 5));
		
		imprimirTela(Calculadora.subtrair(50, 25));
		
		imprimirTela(Calculadora.multiplicar(2, 5));
		
		imprimirTela(Calculadora.dividir(10, 1));
		
		imprimirTela(Calculadora.elevarPot(2, 3));

	}
}
