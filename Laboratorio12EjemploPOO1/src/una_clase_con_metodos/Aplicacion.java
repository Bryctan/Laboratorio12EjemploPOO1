package una_clase_con_metodos;

import javax.swing.JOptionPane;
//Se crea una clase llamado Aplicacion para utilizarlo como modulo de arranque 
public class Aplicacion {
	//Se crea un metodo main para ejecutar nuestro codigo
	public static void main(String[] args) {
		//Se declaran las variables para el rectangulo
		double ladoA;
		double ladoB;
		
		//Se pide el lado A del rectangulo
		ladoA = ingresarDatos("Ingrese la longitud del lado A: ");
		//Se pide el lado B del rectangulo
		ladoB = ingresarDatos("Ingrese la longitud del lado B: ");
		//Se llama el metodo calcularArea pasando los argumentos ingresados
		calcularArea(ladoA, ladoB);
		
	}

	
	//Se crea un metodo que nos ayudara a pedir los datos por un panel emergente
	public static double ingresarDatos(String mensaje) {
		//Se declaran las variables a usar
		String cadena;
		double valor;
		
		//El mensaje se guarda primero en un String
		cadena = JOptionPane.showInputDialog(null, mensaje);
		//Luego se parsea a tipo de valor que vamos a nesesitar
		valor = Double.parseDouble(cadena);
		
		return valor;
		//Se retorna el valor
	}
	
	//Se crea un metodo que nos ayudara a realizar la operacion de calculo del area del rectangulo que recibe los 2 lados del rectangulo
	//como argumentos
	public static  void calcularArea(double a,double b) {
		//Se declara una variable de tipo double donde se almacenara el resultado
		double resultado;
		//Se realiza la operacion y se guarda en la variable resultado
		resultado = a * b;
		//Se imprime el resultado por un panel emergente
		JOptionPane.showMessageDialog(null,"El resultado es: " + resultado);
	}
	
}
