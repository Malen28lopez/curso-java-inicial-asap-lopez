package ejercicios.clase01;

import com.github.sanchezih.util.io.Consola;

public class Ejercicio1 {
	
	/**
	 * Programa que lee 1 numero entero por teclado e indica si es multiplo de 2 o de 3);
	 */

	public static void main(String[] args) {
		int numero = Consola.leerEntero("Introduce un numero entero:");
		System.out.println(numero);

		if (numero % 2 == 0 || numero % 3 == 0) {
			if (numero % 2 == 0) {
				System.out.println("El número es múltipo de 2");
			}
			if (numero % 3 == 0) {
				System.out.println("El número es múltiplo de 3");
			}
		} else {
			System.out.println("El número no es múltiplo de 2 ni múltiplo de 3");
		}
	}
}


