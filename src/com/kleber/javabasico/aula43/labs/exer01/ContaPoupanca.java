package com.kleber.javabasico.aula43.labs.exer01;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
	
	private int diaRendimento;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	@Override
	public String toString() {
		String s = "Conta poupança\n";
		s += "Dia de rendimento: " + diaRendimento + "\n";
		s += super.toString();
		return s;
	}

	public boolean calcularNovoSaldo(double taxaRendimento){
		Calendar hoje = Calendar.getInstance();
        
        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
            this.setSaldo(this.getSaldo() + 
            		(this.getSaldo() * taxaRendimento)/100);
            return true;
        }
        return false;
	}

}
