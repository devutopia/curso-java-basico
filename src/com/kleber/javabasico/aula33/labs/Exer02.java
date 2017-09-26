package com.kleber.javabasico.aula33.labs;

public class Exer02 {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.setDonoDaConta("Kleber Lima");
		conta.setAgencia("1234");
		conta.setNumero("65432-1");
		conta.setEspecial(true);
		conta.setSaldo(-10);
		conta.setValorEspecialUsado(0);
		conta.setLimiteEspecial(500);
		
		System.out.println("Saldo da conta " + conta.getNumero() + " = " + conta.getSaldo());
		
		boolean saqueEfetuado = conta.realizarSaque(500);

		if (saqueEfetuado) {
			System.out.println("Saque realizado com sucesso");
			conta.consultarSaldo();
		} else {
			System.out.println("Não foi possivel realizar o saque. Saldo insuficiente.");
		}
		
		saqueEfetuado = conta.realizarSaque(500);
		System.out.println("Tentativa de saque de 500");
		if (saqueEfetuado){
			System.out.println("Saque realizado com sucesso");
			conta.consultarSaldo();
		} else {
			System.out.println("Não foi possivel realizar o saque. Saldo insuficiente.");
		}
		
		System.out.println("Depósito de 500 reais");
		conta.depositar(500);
		conta.consultarSaldo();
		
		if (conta.verificarUsoChequeEspecial()){
			System.out.println("Esta usando cheque especial");
		} else {
			System.out.println("Não está usando cheque especial");
		}
		
		conta.realizarSaque(500);
		conta.consultarSaldo();
		if (conta.verificarUsoChequeEspecial()){
			System.out.println("Esta usando cheque especial");
		} else {
			System.out.println("Não está usando cheque especial");
		}

	}
}
