package com.jjam.juegodetexto;
import java.util.*;
public class MonstruosPrototypeManager {
	private HashMap<String, MounstruoPrototype> prototipo = new HashMap<String, MounstruoPrototype>();
	
	public MonstruosPrototypeManager(){
		Ogro ogro = new Ogro(100, 25, "Mazo", "Feo");
		Ogro ogroPequeño = new Ogro(70, 10, "Navaja", "Enano");
		Ogro ogroGigante = new Ogro(200, 70, "Metralleta", "Escudos Protectores");
		Dragon dragonRojo = new Dragon(200, 80, "Fuego Acido", "Rojo");
		Dragon dragonBlanco = new Dragon(100, 45, "Fuego normal", "Blanco");
		Dragon dragonNegro = new Dragon(20, 100, "Fuego Cegador", "Negro");
		
		prototipo.put("Ogro", ogro);
		prototipo.put("Ogro Pequeño", ogroPequeño);
		prototipo.put("Ogro Gigante", ogroGigante);
		prototipo.put("Dragon Rojo", dragonRojo);
		prototipo.put("Dragon Blanco", dragonBlanco);
		prototipo.put("Dragon Negro", dragonNegro);
		
	}
	public Object prototipos(String tipo) throws CloneNotSupportedException{
		return prototipo.get(tipo).clone();
	}
}
