package ejerciciosClase2;

import com.github.sanchezih.util.io.Consola;

/**
 * Comprobar si dos numeros son amigos. Dos numeros enteros positivos A y B son
 * numeros amigos si la suma de los divisores propios de A es igual a B y la
 * suma de los divisores propios de B es igual a A.
 * 
 * Los divisores propios de un número incluyen la unidad pero no el propio
 * numero.
 * 
 * Un ejemplo de numeros amigos son los numeros 220 y 284.
 * 
 * Los divisores propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110.
 * 
 * La suma de los divisores propios de 220 da como resultado 284
 * 
 * Los divisores propios de 284 son 1, 2, 4, 71 y 142.
 * 
 * La suma de los divisores propios de 284 da como resultado 220.
 * 
 * Por lo tanto 220 y 284 son amigos.
 * 
 * Otras parejas de numeros amigos son: 1184, 1210 2620, 2924 5020, 5564 6232,
 * 6368 10744, 10856 12285, 14595 17296, 18416
 * 
 *
 */

public class Ejercicio02 {

	public static void main(String[] args) {

		int a = Consola.leerEntero("Introduce el número A:");
		int b = Consola.leerEntero("Introduce un número B para comprobar si ambos números son amigos:");
		int sumaA = 0;
		int sumaB = 0;

		for (int i = 1; i < a; i++) {
			if (a % i == 0) {
				sumaA += i;
			}
		}

		for (int i = 1; i < b; i++) {
			if (b % i == 0) {
				sumaB += i;
			}
		}

		System.out.println("La suma de los divisores de a es =  " + sumaA);
		System.out.println("La suma de los divisores de b es =  " + sumaB);

		if (sumaA == b && sumaB == a) {
			System.out.println(" Por lo tanto son amigos");
		} else {
			System.out.println("Por lo tanto no son amigos");
		}

	}

}