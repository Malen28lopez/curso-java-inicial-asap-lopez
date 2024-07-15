package Clase3;

import com.github.sanchezih.util.io.Consola;
/*
 * Programa que lee la altura de N personas y calcula:
La altura media.
Cuantas personas tienen una altura superior a la media.
Cuantas personas tienen una altura inferior a la media.

El valor de N se pide por teclado y debe ser entero y positivo.
 *
 */

public class Ejercicio1 {
	public static void main(String[] args) {

		int N, superioresMedia = 0, inferioresMedia = 0;
		double sumaAlturas = 0, alturaMedia;

		do {
			System.out.print("Introduce el numero de personas: ");
			N = Consola.leerEntero();
			if (N <= 0) {
				System.out.print("N debe ser un numero entero positivo. Intenta de nuevo: ");

			}
		} while (N <= 0);

		double[] alturas = new double[N];

		for (int i = 0; i < N; i++) {
			System.out.print("Introduce el numero de la persona " + (i + 1) + ": ");
			alturas[i] = Consola.leerDouble();
			sumaAlturas += alturas[i];
		}

		alturaMedia = sumaAlturas / N;

		for (double altura : alturas) {
			if (altura > alturaMedia) {
				superioresMedia++;
			} else if (altura < alturaMedia) {
				inferioresMedia++;
			}
		}
		System.out.printf("Altura media: %.2f metros\n", alturaMedia);
		System.out.println("Personas con altura superior a la media: " + superioresMedia);
		System.out.println("Personas con altura inferior a la media: " + inferioresMedia);
		
	}
}
