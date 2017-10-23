package com.kleber.javabasico.aula43.labs.exer01;

public class Teste {

	public static void main(String[] args) {
		
		ContaBancaria contaSimples = new ContaBancaria() {
		};
		
		contaSimples.setNomeCliente("Cliente conta simples");
		contaSimples.setNumConta("11111");
		
		contaSimples.depositar(100);
		
		realizarSaque(contaSimples, 50);
		
		realizarSaque(contaSimples, 70);
		
		System.out.println(contaSimples);
		
		ContaEspecial contaEspecial = new ContaEspecial();
		
		contaEspecial.setNomeCliente("João");
		contaEspecial.setNumConta("123456");
		contaEspecial.setLimite(500);
		contaEspecial.setSaldo(10);
		
		realizarSaque(contaEspecial, 15);
		
		contaEspecial.depositar(300);
		
		System.out.println(contaEspecial.toString() + "\nLimite especial R$ = " + contaEspecial.getLimite());
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		
		contaPoupanca.setNomeCliente("Joaquim");
		contaPoupanca.setNumConta("112233");
		contaPoupanca.setDiaRendimento(22);
		contaPoupanca.setSaldo(0);
		
		realizarSaque(contaPoupanca, 15);
		
		contaPoupanca.depositar(300);
		
		contaPoupanca.calcularNovoSaldo(1);
		
		System.out.println(contaPoupanca.toString());
	}
	
	private static void realizarSaque(ContaBancaria conta, double valor){
        if (conta.sacar(valor)){
            System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de = " + conta.getSaldo());
        }
    }
}
