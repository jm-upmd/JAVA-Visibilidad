package paquete1;



@SuppressWarnings("unused")

// Clase con visibilidad de paquete.
// No tiene modificador de acceso
class ClaseB {
	private int variable1; 	// solo visible dentro de la propia clase ClaseA
	int variable2; 			// visible también dentro del propio paquete paquete1
	public int variable3;	// visible desde cualquier sitio, incluso desde otro paquete
							// distinto a a paquete1
	
	// Los método tienen mismo comportamiento de visibilidad que atributos
	
	// Visible solo desde dentro de su clase.
	private void metodoPrivado() {
		// Variable local al método. No tienen modificador de alcance.
		// Solo son visibles desde dentro del propio método.
		int variableLocal = 1;
		
		// Atributos de la clase son visibles desde los métodos de la clase
		variable1 = 1;
		variable2 = 2;
		variable3 = 3;	
	}
	
	public void metodoPublico( ) {
		variable1++;
		// Desde método de la misma clase se tiene visibilidad de los metodos private de la clase
		metodoPrivado(); 
	}
	
	// Método sin modificador de acceso por defecto es package (visibilidad a nivel de paquete)
	// Accesible desde cualquier objeto dentro del paquete
	
	void metodoPaquete() {
		variable2++;
		
	}
}
