package com.java.Ejercicios;

public class CocheVelocidad {

	public static void main(String[] args) {

		int limiteVelocidad = 80; // Calle
		int velocidadActual = 80;

		boolean carretera = false; // Alternar valor para entrar en los ciclos del if 1

		if (carretera) { // Carretera es true if1

			limiteVelocidad = 50; // Nuevo valor a la variable para el if siguiente
			boolean zescolar = false; // Alternar valor para entrar en los ciclos del if 2

			if (zescolar) { //Ciclo true if 2
				 if (velocidadActual > limiteVelocidad) {
					System.out.println("MULTA! - Vas en Zona Escolar");
				 } else {
					System.out.println("DESCUENTO! - Vas en Zona Escolar");
				 }
			} else { //Ciclo false
				 limiteVelocidad = 100; // Nuevo valor a la variable para el if siguiente
				
				 if (velocidadActual > limiteVelocidad) {
					System.out.println("MULTA! - Vas en Carretera");
				 } else {
					System.out.println("DESCUENTO! - Vas en Carretera"); //
				 }
			}

		} else if (velocidadActual > limiteVelocidad) { // Carretera es false, y toma valor de variable fuera de if
			System.out.println("MULTA! - Vas en Calle");
		} else {
			System.out.println("DESCUENTO! - Vas en Calle");
		}
	}
}
