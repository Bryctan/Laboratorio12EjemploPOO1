package dos_clases;

import javax.swing.JOptionPane;


//Se crea una clase llamada Entidad que nos va a servir como plantilla para nuestros objetos
public class Entidad {
	//se declaran los atributos de la clase Entidad
	private double ladoA;
	private double ladoB;
	
	
	//Se crea un metodo que utilizaremos para pedir los datos y asignarles los valores a los atributos de la clase Entidad
	public void ingresarDatos() {
		String cadena;
		//Se pide el lado A del rectangulo
		cadena = JOptionPane.showInputDialog(null,"Ingresa la longitud del lado A: ");
		ladoA = Double.parseDouble(cadena);
		//Se pide el lado B del rectangulo
		cadena = JOptionPane.showInputDialog(null,"Ingresa la longitud del lado B: ");
		ladoB = Double.parseDouble(cadena);
		
	}
	//Se crea un metodo para calcular la area del rectangulo
	public void calcularArea() {
		//Se declara una variable de tipo double donde se almacenara el resultado
		double resultado;
		//Se realiza la operacion
		resultado = ladoA*ladoB;
		//Se imprime el resultado
		JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
		
	}

	
	
	
	
}
