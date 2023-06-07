package EjercicioNumeros;

import javax.swing.JOptionPane;

//Se crea una clase llamada Entidad que nos va a servir como plantilla para nuestros objetos
public class Numeros {
	//Se declaran los atributos que va a tener nuestra clase 
	int numer;
	int i, neg =0, par=0;
	
	//Se crea un metodo para iniciar el proceso
	public void entrada() {
		
		//Se crea un ciclo que va iterar hasta cumplir la condicion del ciclo (itera 4 veses)
		for (int i = 0; i < 5; i++) {
			//Se utiliza el metodo ingresarDatos pasando un mensaje como argumento
			numer = ingresarDatos("digite 1 numero");
			//Se valida que el numero ingresado al dividirlo entre 2 su residuo o mudulo sea igual 0 es decir que sea par
			if (numer % 2 == 0) {
				//Se incrementa el variable par en 1 cada vez se cumple la condicion
				par++;
			}
			//Se valida que el numero ingresado sea menor a 0 es decir que sea negativo
			if (numer<0) {
				//Se incrementa el variable neg en 1 cada vez se cumple la condicion
				neg++;
			}
			
		}
		//Se imprime por un panel emergente imprimendo el resultado de la cantidad de numeros pares o negativos ingresados
		JOptionPane.showMessageDialog(null, "el numero de numeros pares es: "+par+"\n"
				+"y el numero de numeros negativos es: "+neg);

	}
	//Se crea un metodo que nos ayudara a ingresar los datos al sistema recibiendo un mensaje de argumento
	public static int ingresarDatos(String mensaje) {
		//Se crean las variables
		String cadena;
		int valor;
		//Se pide el mensaje 
		cadena = JOptionPane.showInputDialog(null,mensaje);
		//Luego ese mensaje se convierte el dato que necesitamos almacenar
		valor = Integer.parseInt(cadena);
		//Por ultimo se retorna la variable
		return valor;

	}
	
}
