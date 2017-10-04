package com.kleber.javabasico.aula35.labs;

public class CalculoRecursivo {

	public static int calcNum(int num){
		int soma = 0;
		
		for(int i=0; i<num; i++){
			soma += num;
		}
		
		return soma;
	}
}
