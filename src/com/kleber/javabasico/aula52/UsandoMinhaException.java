package com.kleber.javabasico.aula52;

public class UsandoMinhaException {

	public static void main(String[] args) {
			int[] numeros = {4, 8, 5, 16, 32, 21, 64, 128};
			int[] denon = {2, 0, 4, 8, 0, 2, 4};
			
			for (int i=0; i<numeros.length; i++){
				try {
					if(numeros[i] % 2 != 0){
						//lançar a exception aqui
						throw new DivisaoNaoExata(numeros[i], denon[i]);
					}
					System.out.println(numeros[i] + "/" + denon[i] + " = " + (numeros[i]/denon[i]));
				} 
				catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata ex) {
					System.out.println("Ocorreu um erro generico");
					ex.printStackTrace();
				}
			}

		}

}
