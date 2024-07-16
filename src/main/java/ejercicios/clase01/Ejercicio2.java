package ejercicios.clase01;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que pide por teclado la fecha de nacimiento de una persona (día,
 * mes, año) y calcula su numero de la suerte.
 * El numero de la suerte se calcula sumando el dia, mes y anio de la fecha de nacimiento y 
 * a continuacion sumando las cifras obtenidas en la suma. 
 * 
 *
 */

public class Ejercicio2 {
	public static void main(String[] args) {

		int dia = Consola.leerEntero("Ingresa el número del día en que naciste");
		int mes = Consola.leerEntero("Ingresa el número del mes en que naciste");
		int año = Consola.leerEntero("Ingresa el número del año en que naciste");

		int total = dia + mes + año;
		int numeroSuerte = (total / 1000) + ((total / 10) % 10) + ((total / 10) % 10) + (total % 10);

		System.out.println(total);
		System.out.println(numeroSuerte);
	}
}
