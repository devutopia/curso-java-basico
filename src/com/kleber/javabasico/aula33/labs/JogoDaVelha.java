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
	
	public boolean validarJogada(int linha, int coluna, char sinal) {

        if (jogoDaVelha[linha][coluna] == 'X' || jogoDaVelha[linha][coluna] == 'O') {
            return false;
        } else { //jogada válida
            jogoDaVelha[linha][coluna] = sinal;
            this.jogada++;
            return true;
        }
    }
	
	public void imprimirTabuleiro(){
		for (int i = 0; i < jogoDaVelha.length; i++) {
            for (int j = 0; j < jogoDaVelha[i].length; j++) {
                System.out.print(jogoDaVelha[i][j] + " | ");
            }
            System.out.println();
        }
	}
	
	public boolean verificarGanhador(char sinal) {
        if ((jogoDaVelha[0][0] == sinal && jogoDaVelha[0][1] == sinal && jogoDaVelha[0][2] == sinal) || //linha 1
                (jogoDaVelha[1][0] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[1][2] == sinal) || //linha 2
                (jogoDaVelha[2][0] == sinal && jogoDaVelha[2][1] == sinal && jogoDaVelha[2][2] == sinal) || //linha 3
                (jogoDaVelha[0][0] == sinal && jogoDaVelha[1][0] == sinal && jogoDaVelha[2][0] == sinal) || //coluna 1
                (jogoDaVelha[0][1] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[2][1] == sinal) || //coluna 2
                (jogoDaVelha[0][2] == sinal && jogoDaVelha[1][2] == sinal && jogoDaVelha[2][2] == sinal) || //coluna 3
                (jogoDaVelha[0][0] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[2][2] == sinal) || //diagonal
                (jogoDaVelha[0][2] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[2][0] == sinal)) {  //diagonal inversa
            return true;
        }
        return false;
	}
	
	public boolean vezJogador1(){
		if (this.jogada % 2 == 1){
			return true;
		}
		return false;
	}
}
