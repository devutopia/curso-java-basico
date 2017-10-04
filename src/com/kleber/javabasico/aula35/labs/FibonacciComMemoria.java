package com.kleber.javabasico.aula35.labs;

public class FibonacciComMemoria {
	
	private final static int TAM_MEMORIA = 50;
	private static long[] memoria = new long[TAM_MEMORIA];
	
	public static long fibonacci (int num){
		
		if (num < 2){
			return memoria[num];
		}
		
		//verifica se o n�mero j� foi calculado e salvo na mem�ria
		//caso contr�rio, faz o c�lculo e salva
		
		long fib = memoria[num];
		if(fib == 0){
			fib = fibonacci(num - 1) + fibonacci(num - 2);
			memoria[num] = fib;
		}
		
		return memoria[num];
		
	}
	
	public static void main (String[] args){
		
		memoria[0] = 0;
		memoria[1] = 1;
		
		for (int i=0;i<TAM_MEMORIA; i++){
			System.out.println("Fibonacci de " + i + ": " + fibonacci(i));
		}
	}

}
