package com.kleber.javabasico.aula43.labs.exer01;

public class ContaEspecial extends ContaBancaria{
	
	private double limite;
	
	public ContaEspecial() {
	}

	public ContaEspecial(double limite) {
		super();
		this.limite = limite;
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public String toString() {
		 String s = "Conta Especial\n";
		 s +=  "Limite especial R$ = " + limite + "\n";
		 s += super.toString();
		 return s;
	}
	
	@Override
	public boolean sacar(double valorSaque) {
		
		double saldoComLimite = this.getSaldo() + limite;
		
		if ((saldoComLimite - valorSaque) >= 0){
			this.setSaldo(this.getSaldo() - valorSaque);
			return true;
		}
		return false;
	}

}
