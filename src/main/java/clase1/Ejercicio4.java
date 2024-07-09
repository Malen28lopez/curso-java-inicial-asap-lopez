package clase1;

import com.github.sanchezih.util.io.Consola;

public class Ejercicio4 {
	/**
	 * Programa que comprueba si un año es bisiesto. Un año es bisiesto si es
	 * divisible por 4 y no lo es por 100 o si es divisible por 400.
	 * 
	 *
	 */


		public void main(String[] args) {
			int año = Consola.leerEntero("Introduce el año que deseas comprobar si es bisiesto");
			if (año % 400 == 0) {
				System.out.println("El año es bisiesto");
			} else if (año % 4 == 0 && año % 100 != 0) {
				System.out.println("El año es bisiesto!!");
			}

			else {
				System.out.println("El año no es bisiesto");
			}

		}

	}
