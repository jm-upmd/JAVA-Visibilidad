package paquete1;

import paquete2.ClaseC;

@SuppressWarnings("unused")

// Clase publica que contiene el método main
public class ClaseMain {

	public static void main(String[] args) {
		
		
		// Creamos objeto de la clase Clase A.
		// Podemos porque ClaseA es publica y se puede instanciar 
		// desde cualquier sitio
		
		ClaseA ObjetoClaseA = new ClaseA(); 
		
		// No tenemos visibilidad de su atributo privado variable1
		// ObjetoClaseA.variable1
		
		// Sí tenemos visibilidad de su atributo variable2 porque
		// estamos en el mismo paquete que ClaseA
		ObjetoClaseA.variable2 = 3;
		
		// Sí tenemos visibilidad de su atributo variable3 ya que
		// es publico y visible desde este y cualquier otro paquete.
		
		ObjetoClaseA.variable3 = 5;
		
		// Sí tenemos visibilidad de los metodos metodoPublico y
		// metodoPackage ya que son public (acceso desde cualquier lado)
		// y package (acceso desde el mismo paquete) respectivamente.
		
		ObjetoClaseA.metodoPaquete();
		ObjetoClaseA.metodoPublico();
		
		// No tenemos visibilidad del metodo privado metodoPrivate
		// ya que es accesible solo desde dentro de su propia clase
		//ObjetoClaseA.metodoPrivate();
		
		// Creamos objeto de la clase ClaseB.
		// Podemos porque ClaseB tiene visibilidad de paquete y
		// estamos en el mismo paquete
		
		ClaseB ObjetoClaseB = new ClaseB();
		
		// El alcance de sus atributos y métodos es el mismo que los de 
		// la clase ClaseA
		
		
		// Creamos objeto de la clase ClaseC.
		// Podemos porque aunque esté en otro paquete es publica.
		// Al estar en un paquete distinto a este hay que hacer un import
		// de la clase (ver instrucción import de la línea 3)
		
		ClaseC ObjetoClaseC = new ClaseC();
		
		// Tengo acceso a su metodo publico
		ObjetoClaseC.metodoPublico();
		
		// No tengo visibilidad de su método metodoPaquete
		//ObjetoClaseC.metodoPaquete();
		

	}

}
