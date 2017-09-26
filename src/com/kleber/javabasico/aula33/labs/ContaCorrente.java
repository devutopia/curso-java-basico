package com.kleber.javabasico.aula33.labs;

public class ContaCorrente {
	
	private String donoDaConta;
	private String numero;
	private String agencia;
	private double saldo;
	private boolean especial;
	private double limiteEspecial;
	private double valorEspecialUsado;
	
	public ContaCorrente() {
		
	}
	
	public ContaCorrente(String donoDaConta, String numero, String agencia, double saldo, boolean especial,
			double limiteEspecial, double valorEspecialUsado) {
		this.donoDaConta = donoDaConta;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.especial = especial;
		this.limiteEspecial = limiteEspecial;
		this.valorEspecialUsado = valorEspecialUsado;
	}

	public String getDonoDaConta() {
		return donoDaConta;
	}

	public void setDonoDaConta(String donoDaConta) {
		this.donoDaConta = donoDaConta;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}

	public double getValorEspecialUsado() {
		return valorEspecialUsado;
	}

	public void setValorEspecialUsado(double valorEspecialUsado) {
		this.valorEspecialUsado = valorEspecialUsado;
	}
	
	public void informarDadosConta (){
		System.out.println("Dados da Conta de        - " + this.donoDaConta);
		System.out.println("Agência nº               : " + this.agencia);
		System.out.println("Conta Corrente n         : " + this.numero);
		System.out.println("Valor Cheque Especial - R$ " + this.agencia);
		consultarSaldo();
	}

	public boolean realizarSaque(double quantiaASacar){
		
		//tem saldo na conta
		if(getSaldo() >= quantiaASacar){
			this.saldo -=quantiaASacar;
			return true;
		} else { //não tem saldo na conta
			if (isEspecial()){
				//verificar se o limite especial tem saldo
				double limite = this.limiteEspecial + this.saldo;
				if (limite >= quantiaASacar){
					this.saldo -= quantiaASacar;
					return true;
				} else {
					return false;
				}
			} else {
				return false; //não é especial e não tem saldo suficiente
			}
		}
	}
	
	public void depositar(double valorDepositado){
		this.saldo += valorDepositado;
	}
	
	public void consultarSaldo(){
		System.out.println("Saldo atual da conta = " + this.saldo);	
	}
	
	public boolean verificarUsoChequeEspecial(){
		return this.saldo < 0;
	}

}
