package com.kleber.javabasico.aula27.labs;

public class ContaCorrente {

	String numero;
	String agencia;
	double saldo;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	
	
	// M�todos criado por mim.
	
	/*void consultarSaldo(){
		if (saldo >= 0){
			System.out.println("Valor do saldo atual = R$ " + (saldo + limiteEspecial));
		} else if (saldo < 0){
			System.out.println("Aten��o, vc est� utilizando o cheque especial!");
			System.out.println("Saldo do cheque Especial: R$ " + limiteEspecial);
		}
	}
	
	void depositar (double valorDeposito){
		
		saldo += valorDeposito;		
		System.out.println("Dep�sito realizado com sucesso!");
	
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
	}*/
	
	
	//M�todos da corre��o
	
	boolean realizarSaque(double quantiaASacar){
		
		//tem saldo na conta
		if(saldo >= quantiaASacar){
			saldo -=quantiaASacar;
			return true;
		} else { //n�o tem saldo na conta
			if (especial){
				//verificar se o limite especial tem saldo
				double limite = limiteEspecial + saldo;
				if (limite >= quantiaASacar){
					saldo -= quantiaASacar;
					return true;
				} else {
					return false;
				}
			} else {
				return false; //n�o � especial e n�o tem saldo suficiente
			}
		}
	}
	
	void depositar(double valorDepositado){
		saldo += valorDepositado;
	}
	
	void consultarSaldo(){
		System.out.println("Saldo atual da conta = " + saldo);	
	}
	
	boolean verificarUsoChequeEspecial(){
		return saldo < 0;
	}
}
