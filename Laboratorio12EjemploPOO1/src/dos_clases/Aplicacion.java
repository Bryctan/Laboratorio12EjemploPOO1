package dos_clases;
// Se crea una clase llamado Aplicacion para utilizarlo como modulo de arranque 
public class Aplicacion {
	//Se crea un metodo main para instanciar nuestro objeto y ejecutar nuestro codigo
	public static void main(String[] args) {
		//Se declara un objeto de clase Entidad
		Entidad rectangulo;
		//Se construye el objeto
		rectangulo = new Entidad();
		//Se utilizan los metodos del objeto
		rectangulo.ingresarDatos();
		rectangulo.calcularArea();
		

	}

}
