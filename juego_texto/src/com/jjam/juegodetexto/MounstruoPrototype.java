package com.jjam.juegodetexto;

public abstract class MounstruoPrototype implements Cloneable{

	private String arma;
	private int vida;
	private int fuerza;
	
	public MounstruoPrototype( int vida, int fuerza, String arma){
		setVida(vida);
		setFuerza(fuerza);
		setArma(arma);
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	

	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	
	public String getArma() {
		return arma;
	}
	public void setArma(String arma) {
		this.arma = arma;
	}
	
	
	
}
