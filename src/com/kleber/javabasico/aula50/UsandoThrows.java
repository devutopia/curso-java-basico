package com.kleber.javabasico.aula50;

import java.util.Scanner;

public class UsandoThrows {

	private static Scanner scan;

	public static void main(String[] args) {
		
		System.out.println("Entre com um n�mero decimal: ");
		try {
			double num = leNumero();
			System.out.println("Voc� digituou " + num);
		} catch (Exception e) {
			System.out.println("Entrada inv�lida.");
			e.printStackTrace();
		}
		

	}
	
	public static double leNumero() throws Exception {
		scan = new Scanner(System.in);
		double num = scan.nextDouble();
		return num;
	}

}
