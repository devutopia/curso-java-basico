package com.kleber.javabasico.aula43.labs.exer01;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("********Teste Conta simples********");
		ContaBancaria contaSimples = new ContaBancaria();
		
		contaSimples.setNomeCliente("Cliente conta simples");
		contaSimples.setNumConta("11111");
		
		contaSimples.depositar(100);
		
		realizarSaque(contaSimples, 50);
		
		realizarSaque(contaSimples, 70);
		
		System.out.println(contaSimples);
		
		
		System.out.println("********Teste Conta Especial********");
		
		ContaEspecial contaEspecial = new ContaEspecial();
		
		contaEspecial.setNomeCliente("Cliente conta especial");
		contaEspecial.setNumConta("22222");
		contaEspecial.setLimite(50);
		contaEspecial.setSaldo(0);
		
		contaEspecial.depositar(100);
		
		realizarSaque(contaEspecial, 50);
		
		realizarSaque(contaEspecial, 70);
		
		realizarSaque(contaEspecial, 50);
		
		System.out.println(contaEspecial);
		
		System.out.println("********Teste Conta Poupança********");
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		
		contaPoupanca.setNomeCliente("Cliente conta poupança");
		contaPoupanca.setNumConta("33333");
		contaPoupanca.setDiaRendimento(23);
		contaPoupanca.setSaldo(0);
		
		realizarSaque(contaPoupanca, 15);
		
		contaPoupanca.depositar(300);
		
		if (contaPoupanca.calcularNovoSaldo(0.5)){
			System.out.println("Rendimento aplicado, novo saldo de = " + contaPoupanca.getSaldo());
		} else {
			System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
		}
		
		System.out.println(contaPoupanca);
	}
	
	private static void realizarSaque(ContaBancaria conta, double valor){
        if (conta.sacar(valor)){
            System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de = " + conta.getSaldo());
        }
    }
}
