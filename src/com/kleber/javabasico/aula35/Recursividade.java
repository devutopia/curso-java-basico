package com.kleber.javabasico.aula35;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Recursividade {
	
	public static int soma(int x){
		if(x == 0){
			return x;
		} else {
			System.out.println(x);
			return x + soma(x-1);
		}
	}
	
	public static int potencia(int n, int p){
		if(p == 1){
			return n;
		} else {
			return n * potencia(n, p-1);
		}
	}

	
	//Recursividade para listar diretorios
	public static void listar (Path path){
		
		if(Files.isRegularFile(path)){
			System.out.println(path.toAbsolutePath());
		} else {
			String s = "\n" + path.toAbsolutePath();
			System.err.println(s.toUpperCase());
			try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)){
				for (Path p : stream) {
					listar(p);
				}
			}catch (Exception e){}
		}
		
	}
		
	public static void main(String[] args) {
		//System.out.println(soma(10));
		//System.out.println(" \n" + potencia(3, 4));
		
		listar(Paths.get("D:/DesktopKleber"));
	}

}
