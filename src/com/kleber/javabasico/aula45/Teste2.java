package com.kleber.javabasico.aula45;

public class Teste2 {
	
	public static void main(String[] args) {
		
		//exemplo 1: OK
		//retorno do m�todo pode referenciar String
		Object obj1 = obterString();
		String s1 = (String) obj1; //upcasting - n�o ocorre erro.
		
		//exemplo 2: OK
		//obj2 referencia String explicitamente
		Object obj2 = "Minha String";
		String s2 = (String) obj2; //downcasting - n�o ocorre erro.
		
		//exemplo 3: FALHA em tempo de execu��o
		//obj3 n�o faz refer�ncia � uma String
		Object obj3 = new Object(); //downcasting incorreto - ocorre erro de execu��o, 
		//pois a classe Object n�o faz refer�ncia � um String
		String s3 = (String) obj3;
		
		//exemplo 4 FALHA em tempo de compila��o
		//obj4 nunca referencia String j� que o retorno do m�todo � int
		Object obj4 = obterInteiro();//n�o funciona
		String s4 = (String) obj4;
		
	}
	
	public static String obterString() {
		return "minha String";
	}
	
	public static int obterInteiro () {
		return 1;
	}

}
