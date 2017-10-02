package com.kleber.javabasico.aula35.labs;

public class FibonacciRecursivo {
	
	public static int fibonacci (int num){
		
		if (num < 2){
			return num;
		}
		
		return fibonacci(num-1) + fibonacci(num-2);
	}
}
