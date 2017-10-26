package com.kleber.javabasico.aula46.labs;

public class Teste {

	public static void main(String[] args) {
		
		Circulo circulo = new Circulo();
		circulo.setNome("Círculo");
		circulo.setRaio(5);
		
		Quadrado quadrado = new Quadrado();
		quadrado.setNome("Quadrado");
		quadrado.setLado(10);
		
		Triangulo triangulo = new Triangulo();
		triangulo.setNome("Triângulo");
		triangulo.setBase(5);
		triangulo.setAltura(10);
		
		Cilindro cilindro = new Cilindro();
		cilindro.setNome("Cilindro");
		cilindro.setRaio(5);
		cilindro.setAltura(10);
		
		Cubo cubo = new Cubo();
		cubo.setNome("Cubo");
		cubo.setLado(4);
		
		Piramide piramide = new Piramide();
		piramide.setNome("Piramide");
		piramide.setAltura(3);
		piramide.setApotema(4);
		piramide.setArestaBase(2);
		piramide.setNumPoliBase(4);
		piramide.setBase(triangulo);
		
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
