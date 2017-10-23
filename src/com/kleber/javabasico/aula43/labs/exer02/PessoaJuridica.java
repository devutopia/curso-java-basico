package com.kleber.javabasico.aula43.labs.exer02;

public class PessoaJuridica extends Contribuinte {
	
	private String cnpj;
	private final double ALIQUOTA = 10;

	public PessoaJuridica() {
		super();
	}
	public PessoaJuridica(String cnpj) {
		super();
		this.cnpj = cnpj;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		s += "Pessoa jurídica\n";
		s += "CNPJ = " + cnpj + "\n";
		s += "Valor do imposto à pagar R$ = " + calcularImposto();
		return s;
	}
	@Override
	public double calcularImposto() {
		double valorImposto = (getRendaBruta() * ALIQUOTA)/100;
		return valorImposto;
	}
}
