package com.kleber.javabasico.aula52;

public class DivisaoNaoExata extends Exception{
	
	private int num;
	private int denom;
	/**
	 * @param num
	 * @param denom
	 */
	public DivisaoNaoExata(int num, int denom) {
		super();
		this.num = num;
		this.denom = denom;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ("Resultado de " + num + "/" + denom + " não é um inteiro");
	}
	
	

}
