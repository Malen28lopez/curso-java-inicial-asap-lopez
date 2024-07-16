package ejercicios.clase2;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que muestra los N primeros numeros de la serie de Fibonacci. El
 * valor de N se lee por teclado.
 * 
 * La serie de fibonacci la forman una serie de numeros tales que: El primer
 * termino de la serie es el numero 1. El segundo termino de la serie es el
 * numero 1. Los siguientes terminos de la serie de fibonacci se obtienen de la
 * suma de los dos anteriores: 1, 1, 2, 3, 5, 8, 13…
 * 
 *
 */

public class Ejercicio01 {
	public static void main(String[] args) {
		 int numero = Consola.leerEntero("Introduce un numero entero:");
	        
	        int a = 1;
	        int b = 1;
	        System.out.print("Los " + numero + " primeros números de la serie de Fibonacci son: ");
	        	        
	        for (int i = 1; i <= numero; i++) {
	            System.out.print(a + " ");
	            int c = a + b;
	            a = b;
	            b = c;
	        }

	}

}

