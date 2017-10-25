package com.kleber.javabasico.aula45;

public class Teste2 {
	
	public static void main(String[] args) {
		
		//exemplo 1: OK
		//retorno do método pode referenciar String
		Object obj1 = obterString();
		String s1 = (String) obj1; //upcasting - não ocorre erro.
		
		//exemplo 2: OK
		//obj2 referencia String explicitamente
		Object obj2 = "Minha String";
		String s2 = (String) obj2; //downcasting - não ocorre erro.
		
		//exemplo 3: FALHA em tempo de execução
		//obj3 não faz referência à uma String
		Object obj3 = new Object(); //downcasting incorreto - ocorre erro de execução, 
		//pois a classe Object não faz referência à um String
		String s3 = (String) obj3;
		
		//exemplo 4 FALHA em tempo de compilação
		//obj4 nunca referencia String já que o retorno do método é int
		Object obj4 = obterInteiro();//não funciona
		String s4 = (String) obj4;
		
	}
	
	public static String obterString() {
		return "minha String";
	}
	
	public static int obterInteiro () {
		return 1;
	}

}
