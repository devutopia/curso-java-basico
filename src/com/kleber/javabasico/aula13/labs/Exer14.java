package com.kleber.javabasico.aula13.labs;

import java.util.Scanner;

public class Exer14 {
	
	/*Faça um programa que pega o tamanho de um arquivo para download
	(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
	informe o tempo aproximado de download do arquivo usando este link
	(em minutos)*/

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do arquivo:");
		double tamArquivo  = scan.nextDouble();
		
		System.out.println("Informe a velocidade da sua internet:");
		double velInternet = scan.nextDouble();
		
		double tempo = tamArquivo / velInternet;

		System.out.println("Tempo de download: " + tempo + " min.");

	}

}
