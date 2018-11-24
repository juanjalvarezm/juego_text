package com.jjam.juegodetexto;

public class Main {

	public static void main(String[] args) throws Exception {
		//Definiendo monstruos.
		String[] MonstruoPosible = {"Ogro", "Ogro Pequeño", "Ogro Gigante", "Dragon Rojo", "Dragon Blanco", "Dragon Negro"};
		  int numeroMonstruo = (int) (Math.random()*6);
		MonstruosPrototypeManager monstruop = new MonstruosPrototypeManager();
		MounstruoPrototype monstruo = (MounstruoPrototype) monstruop.prototipos(MonstruoPosible[numeroMonstruo]);
		
		
		
	}

}
