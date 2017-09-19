package com.kleber.javabasico.aula33.labs;

public class JogoDaVelha {
	
	private char[][] jogoDaVelha;
	private int jogada;
	
	public JogoDaVelha() {
		this.jogoDaVelha = new char[3][3];
		this.jogada = 1;
	}

	/**
	 * @return the jogoDaVelha
	 */
	public char[][] getJogoDaVelha() {
		return jogoDaVelha;
	}

	/**
	 * @param jogoDaVelha the jogoDaVelha to set
	 */
	public void setJogoDaVelha(char[][] jogoDaVelha) {
		this.jogoDaVelha = jogoDaVelha;
	}

	/**
	 * @return the jogada
	 */
	public int getJogada() {
		return jogada;
	}

	/**
	 * @param jogada the jogada to set
	 */
	public void setJogada(int jogada) {
		this.jogada = jogada;
	}
	
	
	

}
