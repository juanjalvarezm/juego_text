package com.jjam.juegodetexto;

public class Dragon extends MounstruoPrototype{
	
	public String color;
	
	public Dragon(int vida, int fuerza, String arma, String color) {
		super(vida, fuerza, arma);
		setColor(color);
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
