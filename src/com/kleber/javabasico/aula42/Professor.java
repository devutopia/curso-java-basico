package com.kleber.javabasico.aula42;

public class Professor {
	
	
	private String departamento;
	private String nomeCurso;
	private double salario;
	
	public Professor() {
	}

	/**
	 * @return the departamento
	 */
	public String getDepartamento() {
		return departamento;
	}
	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	/**
	 * @return the nomeCurso
	 */
	public String getNomeCurso() {
		return nomeCurso;
	}
	/**
	 * @param nomeCurso the nomeCurso to set
	 */
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}
	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double calcularSalarioLiquido(){
		return 0;
	}
	
	/*@Override
	public String obterEtiquetaEndereco() {
		String s = "Endereço do Professor: ";
		s += super.getEndereco();
		return s;
	}

	@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println("Imprimindo endereço do professor: ");
		System.out.println(this.obterEtiquetaEndereco());
		
	}*/

}
