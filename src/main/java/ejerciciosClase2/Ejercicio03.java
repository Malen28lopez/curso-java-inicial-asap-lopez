package ejerciciosClase2;

import com.github.sanchezih.util.io.Consola;

/**
 * El programa leera por teclado un numero entero positivo y calculara la suma
 * de sus cifras. Por ejemplo, si se ingresa el numero 3601 el programa debera
 * mostrar: "La suma de sus cifras es: 10".
 * 
 * 
 *
 */

public class Ejercicio03 {

	public static void main(String[] args) {
		int numero = Consola.leerEntero("Introduce el número");

		int sumaCifras = 0;

		while (numero > 0) {
			int cifra = numero % 10;
			sumaCifras += cifra;
			numero /= 10;
		}

		System.out.println("La suma de las cifras es: " + sumaCifras);

	}

}
