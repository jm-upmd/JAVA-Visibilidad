package paquete2;

import paquete1.ClaseA;

public class ClaseC {
	
	int atributoDeClase = 0;
	
	
	public void metodoPublico() {
		// Como claseA de paquete1 es publica tengo visibilidad
		// de ella desde el paquete2, por tando puedo instanciar 
		// un objeto suyo.
		ClaseA objA = new ClaseA();
		
		// Tengo visibilidad de su método publico metodoPublico
		objA.metodoPublico();
		
		// Tengo visibilidad de su atibuto publico
		objA.variable3 = 5;
		
		// Del resto de metodos y atributos no tengo visibilidad al 
		// ser package o private.
		
		// No tengo visibilidad de las clases ClaseB porque es paquete
		// y no está dentro de este paquete (paquete2)
		
	}
	
	void metodoPaquete() {
		// Los atributos de la clase son visibles desde cualquier
		// método de la clase
		atributoDeClase ++;
		
	}
}
