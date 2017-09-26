package com.kleber.javabasico.aula34.labs;

public class Calculadora {
	
	private static double resultOperacao;
	
	public Calculadora() {
	}
	
	/**
	 * @return the resultOperacao
	 */
	public static double getResultOperacao() {
		return resultOperacao;
	}

	/**
	 * @param resultOperacao the resultOperacao to set
	 */
	public static void setResultOperacao(double resultOperacao) {
		Calculadora.resultOperacao = resultOperacao;
	}
	
	public static double somar (double num1, double num2){
		setResultOperacao(num1 + num2);
		return getResultOperacao();
	}
	
	public static double subtrair (double num1, double num2){
		setResultOperacao(num1 - num2);
		return getResultOperacao();
	}
	
	public static double multiplicar (double num1, double num2){
		setResultOperacao(num1 * num2);
		return getResultOperacao();
	}
	
	public static double dividir (double num1, double num2){
		setResultOperacao(num1 / num2);
		return getResultOperacao();
	}
	
	public static double elevarPot (double base, double potencia){
		setResultOperacao(Math.pow(base, potencia));
		return getResultOperacao();
	}
	
	
	//5! = 5 * 4 * 3 * 2 * 1 = 120
	//0! = 1
	public static int fatorial (int num){
		
		if (num == 0){
			return 1;
		}
		
		int total = 1;
		for (int i=num; i>1; i--){
			total *= i;
		}
		return total;
	}
}
