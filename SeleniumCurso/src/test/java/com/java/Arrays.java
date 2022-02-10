package com.java;

public class Arrays {

	public static void main(String[] args) {
		/*
		 * Los arreglos pueden guardar multiples variables y existen diferentes tipos:
		 * boolean, int, etc.. Tipos de arreglos: 1. Unidimensional: Solamente tiene un
		 * eje "x". Posición, inician con la 0, y sigue 1, 2, 3 2. Bidimensional: Vive
		 * en eje "x" y "y" = matriz. Posición, 0.0, 0.1, 0.2 - 1.0, 1.1 etc.. 3.
		 * Multidimensional: Muchas dimensiones. Muchos valores Los arreglos se declaran
		 * mediante el tipo de dato que contendran: String[] dias =
		 * {"Lunes","Martes","Miercoles"}; int [] num={1,2,3};
		 */

		// ARRAYS (ARREGLOS)

		// Arreglo Unidimensional
		// Declaracion con asignacion de valores
		// 0 1 2 3 4 5 6
		String[] dias = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo", "Algo" };

		System.out.println("El dia de hoy es: " + dias[5]);

		// Impresion con for

		int length = dias.length;

		for (int i = 0; i < length; i++) { // Los arreglos tambien tienen metodos embebidos Ej.
			System.out.println(dias[i]); // dias.length => El metodo length da la cantidad de posiciones del arreglo
		}

		// Declaracion con asignacion de valores por separado
		String[] dias2 = new String[7];
		dias2[0] = "Lunes";
		dias2[1] = "Martes";
		dias2[1] = null;

		// Arreglo numerico
		int[] numero = { 1, 2, 3, 5, 7, 100 };

		// Arreglo booleano
		boolean[] algo = { true, true, false, true };

		// ARREGLO MULTIDIMENSIONAL: Las llaves cuadradas son las cantidad de
		// dimensiones que tiene el arreglo.

		String[][][][] datos = new String[2][2][2][2];
		datos[0][0][0][0] = "Hello";
		datos[0][0][0][1] = "Hello2";
		datos[0][0][1][0] = "Hello3";


		// Arreglo Bidimensional

		String[][] nombres = new String[2][2];
		nombres[0][0] = "Ricardo";
		nombres[0][1] = "Adonai";
		nombres[1][0] = "Alejandro";
		nombres[1][1] = "Juan";
		
		//System.out.println("El nombre de la persona es: " + nombres[0][0]);
		
		// ACTIVIDAD: IMPRIMIR EL ARREGLO BIDIMENSIONAL UTILIZANDO UN LOOP
		
		int lengthbid = nombres.length;
		
		for (int i = 0; i < lengthbid; i++) {
			for (int j = 0; j < lengthbid; j++) {
				System.out.println(nombres[i][j]);
			}
		}
	}
}
