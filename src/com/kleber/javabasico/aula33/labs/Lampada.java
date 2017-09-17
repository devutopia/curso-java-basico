package com.kleber.javabasico.aula33.labs;

public class Lampada {

	private String modelo;
	private String tipoLuz;
	private String tensao;
	private int potencia;
	private int quantidade;
	private int garantiaMeses;
	private String tipos[];
	private double preco;
	private boolean estadoLampada;
	
	public Lampada() {	
	}
	
	public Lampada(String modelo, String tipoLuz, String tensao, int potencia, int quantidade, int garantiaMeses,
			String[] tipos, double preco, boolean estadoLampada) {
		this.modelo = modelo;
		this.tipoLuz = tipoLuz;
		this.tensao = tensao;
		this.potencia = potencia;
		this.quantidade = quantidade;
		this.garantiaMeses = garantiaMeses;
		this.tipos = tipos;
		this.preco = preco;
		this.estadoLampada = estadoLampada;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipoLuz() {
		return tipoLuz;
	}

	public void setTipoLuz(String tipoLuz) {
		this.tipoLuz = tipoLuz;
	}

	public String getTensao() {
		return tensao;
	}

	public void setTensao(String tensao) {
		this.tensao = tensao;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getGarantiaMeses() {
		return garantiaMeses;
	}

	public void setGarantiaMeses(int garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}

	public String[] getTipos() {
		return tipos;
	}

	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isEstadoLampada() {
		return estadoLampada;
	}

	public void setEstadoLampada(boolean estadoLampada) {
		this.estadoLampada = estadoLampada;
	}

	public void ligar(){
		this.estadoLampada = true;
	}
	
	public void desligar(){
		this.estadoLampada = false;
	}
	
	public void mostrarEstado(){
		if (estadoLampada){
			System.out.println("Lâmpada está ligada");
		} else {
			System.out.println("Lâmpada está desligada");
		}
	}
	
	public void mudarEstado(){
		if(estadoLampada){
			desligar();
		} else {
			ligar();
		}
	}
}
