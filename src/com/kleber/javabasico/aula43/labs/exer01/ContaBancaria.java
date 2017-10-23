package com.kleber.javabasico.aula43.labs.exer01;

public class ContaBancaria {
	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	public ContaBancaria() {	
	}

	public ContaBancaria(String nomeCliente, String numConta, double saldo) {
		super();
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean sacar(double valorSaque){
		if (valorSaque > getSaldo()){
			return false;
		} else {
			setSaldo(this.saldo-valorSaque);
			return true;
		}
	}
	
	public void depositar(double valorDeposito){
		setSaldo(this.saldo + valorDeposito);
	}

	@Override
	public String toString() {
		
		String s = "Conta Bancaria\n";
		s += "Nome do Cliente: " + nomeCliente + "\n";
		s += "Número da conta: " + numConta + "\n";
		s += "Saldo: " + saldo;
		return s;
	}
}
