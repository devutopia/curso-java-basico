package com.kleber.javabasico.aula27.labs;

//import java.util.Scanner;

public class Exer02 {

	//private static Scanner scan;

	public static void main(String[] args) {
		
		//scan = new Scanner(System.in);
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.agencia = "1992";
		conta.numero = "16686-3";
		conta.especial = true;
		conta.saldo = -10;
		conta.valorEspecialUsado = 0;
		conta.limiteEspecial = 500;
	
		
		/*int opcao = 0;
		boolean escolha = true;
		double valorDeposito = 0;
		double valorSaque = 0;
		
		while (escolha){
			System.out.println("Bem vindo o que deseja fazer?");
			System.out.println("Para saldo    - digite 1");
			System.out.println("Para depósito - digite 2");
			System.out.println("Para saque    - digite 3");
			System.out.println("Para sair     - digite 0");
			opcao = scan.nextInt();
			
			if (opcao == 1) {
				conta.consultarSaldo();
			} else if (opcao == 2){
				System.out.println("Digite o valor do depósito");
				valorDeposito = scan.nextDouble();
				conta.depositar(valorDeposito);
				conta.consultarSaldo();
			} else if (opcao == 3)
			{
				System.out.println("Digite o valor do saque");
				valorSaque = scan.nextDouble();
				conta.sacar(valorSaque);
				conta.consultarSaldo();
			} else if (opcao == 0){
				System.out.println("Obrigado por usar nosso sistema!");
				escolha = false;
			}
		}*/
		
		boolean saqueEfetuado = conta.realizarSaque(10);
		
		if (saqueEfetuado){
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
