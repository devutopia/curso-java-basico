package com.kleber.javabasico.aula44;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao {
	
	private String tamanho;
	private String raca;

	/**
	 * @return the tamanho
	 */
	public String getTamanho() {
		return tamanho;
	}

	/**
	 * @param tamanho the tamanho to set
	 */
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	/**
	 * @return the raca
	 */
	public String getRaca() {
		return raca;
	}

	/**
	 * @param raca the raca to set
	 */
	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public String amamentar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void brincar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void levarPassear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void levarVeterinario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chamarVeterinario() {
		// TODO Auto-generated method stub
		
	}

}
