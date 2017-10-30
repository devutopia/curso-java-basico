package com.kleber.javabasico.aula46.labs;

public class Teste {

	public static void main(String[] args) {
		
		Circulo circulo = new Circulo();
		circulo.setRaio(2);
		
		Quadrado quadrado = new Quadrado();
		quadrado.setLado(2);
		
		Triangulo triangulo = new Triangulo();
		triangulo.setBase(3);
		triangulo.setAltura(2);
		
		Cilindro cilindro = new Cilindro();
		cilindro.setRaio(2);
		cilindro.setAltura(3);
		
		Cubo cubo = new Cubo();
		cubo.setLado(3);
		
		Piramide piramide = new Piramide();
		piramide.setAltura(3);
		piramide.setApotema(4);
		piramide.setArestaBase(2);
		piramide.setNumPoliBase(4);
		piramide.setBase(quadrado);
		
		FiguraGeometrica[] figuras = new FiguraGeometrica[6];
		figuras[0] = circulo;
		figuras[1] = quadrado;
		figuras[2] = triangulo;
		figuras[3] = cilindro;
		figuras[4] = cubo;
		figuras[5] = piramide;
		
		for (FiguraGeometrica figura : figuras) {
			
				System.out.println("----------------");
				System.out.println(figura.getNome());

				if (figura instanceof Figura2D){
					Figura2D f2d = (Figura2D) figura;
					System.out.println(f2d.calcularArea());
				}

				if (figura instanceof Figura3D){
					Figura3D f3d = (Figura3D) figura;
					System.out.println(f3d.calcularArea());
					System.out.println(f3d.calcularVolume());
				}
		}

	}

}
