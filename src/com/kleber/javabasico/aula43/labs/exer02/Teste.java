package com.kleber.javabasico.aula43.labs.exer02;

public class Teste {

	public static void main(String[] args) {
		
		PessoaFisica p1 = new PessoaFisica();
		p1.setNome("Contribuinte 01");
		p1.setRendaBruta(1200);
		p1.setcpf("001.001.001-01");
		
		PessoaFisica p2 = new PessoaFisica();
		p2.setNome("Contribuinte 02");
		p2.setRendaBruta(1800);
		p2.setcpf("002.002.002-02");
		
		PessoaFisica p3 = new PessoaFisica();
		p3.setNome("Contribuinte 03");
		p3.setRendaBruta(2700);
		p3.setcpf("003.003.003-03");
		
		PessoaJuridica p4 = new PessoaJuridica();
		p4.setNome("Contribuinte 04");
		p4.setRendaBruta(10000);
		p4.setCnpj("04.004.004/0004-04");
		
		PessoaJuridica p5 = new PessoaJuridica();
		p5.setNome("Contribuinte 05");
		p5.setRendaBruta(20000);
		p5.setCnpj("05.005.005/0005-05");
		
		PessoaJuridica p6 = new PessoaJuridica();
		p6.setNome("Contribuinte 06");
		p6.setRendaBruta(30000);
		p6.setCnpj("06.006.006/0006-06");
		
		Contribuinte[] contribuintes = new Contribuinte[6];
		
		contribuintes[0] = p1;
		contribuintes[1] = p2;
		contribuintes[2] = p3;
		contribuintes[3] = p4;
		contribuintes[4] = p5;
		contribuintes[5] = p6;
		
		for (Contribuinte c : contribuintes) {
			System.out.println("***************************************");
			System.out.println(c.toString());
		}
		System.out.println("***************************************");
		
	}

}
