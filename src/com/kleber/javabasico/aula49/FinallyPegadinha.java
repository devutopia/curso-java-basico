package com.kleber.javabasico.aula49;

public class FinallyPegadinha {

	public static void main(String[] args) {
		
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denon = {2, 0, 4, 8, 0};
		
		for (int i=0; i<numeros.length; i++){
			try {
				System.out.println(numeros[i] + "/" + denon[i] + " = " + (numeros[i]/denon[i]));
			} catch (ArithmeticException e1) {
				System.out.println("Erro ao dividir por zero");
				System.exit(0);
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println("Posi��o do array inv�lida");
				System.exit(0);
			} finally {
				System.out.println("Sempre � executado ap�s um bloco try ou catch");
			}
		}
	}
}
