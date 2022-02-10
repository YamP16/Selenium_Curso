package com.java.Ejercicios;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// Arreglo Bidimensional

		String[][] nombres = new String[2][2];
		nombres[0][0] = "Ricardo";
		nombres[0][1] = "Adonai";
		nombres[1][0] = "Alejandro";
		nombres[1][1] = "Juan";

		// System.out.println("El nombre de la persona es: " + nombres[0][0]);

		// ACTIVIDAD: IMPRIMIR EL ARREGLO BIDIMENSIONAL UTILIZANDO UN LOOP

		int lengthbid = nombres.length;

		for (int i = 0; i < lengthbid; i++) {
			for (int j = 0; j < lengthbid; j++) {
				System.out.println(nombres[i][j]);
			}
		}
	}

}
