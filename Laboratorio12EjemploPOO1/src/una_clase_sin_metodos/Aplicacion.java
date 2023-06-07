package una_clase_sin_metodos;

import javax.swing.JOptionPane;

//Se crea una clase llamado Aplicacion para utilizarlo como modulo de arranque 
public class Aplicacion {
	
	public static void main(String[] args) {
		//se declaran las variables a utilizar en el proceso
		String cadena;
		double ladoA;
		double ladoB;
		double resultado;
		
		//Se pide el lado A del rectangulo
		cadena = JOptionPane.showInputDialog(null,"Ingrese la longitud del lado A: ");
		//Se convierte al tipo de datos que nesesitamos para operar le calculo
		ladoA = Double.parseDouble(cadena);
		
		//Se pide el lado B del rectangulo
		cadena = JOptionPane.showInputDialog(null,"Ingrese la longitud del lado B: ");
		//Se convierte al tipo de datos que nesesitamos para operar le calculo
		ladoB = Double.parseDouble(cadena);
	
		//Se realiza la operacion con los valores ingresados
		resultado = ladoA * ladoB;
		
		//Se imprime el resultado en un panel emergente
		JOptionPane.showMessageDialog(null,"El resultado es: " + resultado);

	}

}
