package com.kleber.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer29 {

	private static Scanner scan;

	public static void main(String[] args) {
				
		scan = new Scanner(System.in);
		
		System.out.println("Entre com um número:");
		int num = scan.nextInt();
		
		boolean primo;
		
		for (int i=1; i<=num; i++){
			
			primo = true;
			
			for (int j=2; j<i; j++){
				if (i % j == 0){
					//System.out.println("Não é número primo - divisível por " + i);
					primo = false;
				}
			}
			
			if (primo){
				System.out.println(i);
			}	
		}
	}

}
