package com.jjam.juegodetexto;

public class Ogro extends MounstruoPrototype {
	private String cualidad;
	
	public Ogro( int vida, int fuerza, String arma, String cualidad) {
		super( vida, fuerza, arma );
		setCualidad(cualidad);
		
	}
	
	public String getCualidad() {
		return cualidad;
	}
	public void setCualidad(String cualidad) {
		this.cualidad = cualidad;
	}

}
