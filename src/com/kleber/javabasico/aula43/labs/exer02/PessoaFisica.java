package com.kleber.javabasico.aula43.labs.exer02;

public class PessoaFisica extends Contribuinte {
	
	private String cpf;
	
	public PessoaFisica() {
		super();
	}
	public PessoaFisica(String cpf) {
		super();
		this.cpf = cpf;
	}
	public String getcpf() {
		return cpf;
	}
	public void setcpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public String toString() {
		String s = super.toString();
		s += "Pessoa Fisica \n";
		s += "CPF = " + cpf + "\n";
		s += "Valor do imposto à pagar R$ = " + calcularImposto();
		return s;
	}
	/*@Override
	public double calcularImposto() {
		double valorImposto=0;
		
		if (getRendaBruta() <= 1400){
			valorImposto = 0;
		} else if (getRendaBruta() > 1400 && getRendaBruta() <= 2100){
			valorImposto = (getRendaBruta() * 10)/100;
		}  else if (getRendaBruta() > 2100 && getRendaBruta() <= 2800){
			valorImposto = (getRendaBruta() * 15)/100;
		}  else if (getRendaBruta() > 2800 && getRendaBruta() <= 3600){
			valorImposto = (getRendaBruta() * 25)/100;
		}  else if (getRendaBruta() > 3600){
			valorImposto = (getRendaBruta() * 30)/100;
		}
		return valorImposto;
	}*/
	
	//Correção do exercício
	
	@Override
	public double calcularImposto() {
		double renda = this.getRendaBruta();
		
		if (renda <= 1400){
			return 0;
		} 
		
		else if (renda > 1400 && renda <= 2100){
			return (renda * 0.1) - 100;
		}  
		
		else if (renda > 1400 && renda<= 2800){
			return (renda * 0.15) - 270;
		} 
		
		else if (renda > 2800 && renda<= 3600){
			return (renda * 0.25) - 500;
		} 
		// maior que 3600
		return (renda * 0.3) - 700;
	}
}
