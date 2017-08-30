package com.kleber.javabasico.aula27.labs;

public class ContaCorrente {

	String numero;
	String agencia;
	double saldo;
	boolean especial;
	double limiteEspecial;
	
	void consultarSaldo(){
		if (saldo >= 0){
			System.out.println("Valor do saldo atual = R$ " + (saldo + limiteEspecial));
		} else if (saldo < 0){
			System.out.println("Atenção, vc está utilizando o cheque especial!");
			System.out.println("Saldo do cheque Especial: R$ " + limiteEspecial);
		}
	}
	
	void depositar (double valorDeposito){
		
		saldo += valorDeposito;		
		System.out.println("Depósito realizado com sucesso!");
	
	}
	
	double sacar (double valorSaque){
		
		if (!especial && valorSaque > saldo){
			System.out.println("Saldo insuficente para saque.");
		} else if (!especial || valorSaque < saldo){
			saldo -= valorSaque;
		} else {
			saldo -= valorSaque;			
		}
		return valorSaque;
	}
}
