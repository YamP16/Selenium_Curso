package com.java;

public class DataTypes {

	public static void main(String[] args) {
		// Datos primitivos

		byte var1 = 1; // Numerico entero
		short var2 = 1; // Numerico entero
		int var3 = 1; // Numerico entero (Entero) - Automation
		long var4 = 1L; // Numerico entero - Automation
		
		float var5 = 1.2f; // Numerico real 4 bytes de memoria
		double var6 = 2.223; // Numerico real (decimales) - Automation 8 bytes de memoria
		char var7 = 'a'; // Caracter - Automation
		boolean var8 = true; // Boleano - Automation - tiene dos valores TRUE / FALSE

		// Declarar variables
		int x;
		x = 10000;

		int y = 10;

		// Char symbol example
		char symbol = '\u00A9';

		// Cadena Char entre comillas dobles: No es dato primitivo
		String message = "Hello world"; // - Automation

		// Imprimir en consola
		System.out.println(symbol);
		System.out.println(message);

		// Concatenacion, Se representa con el signo +
		System.out.println(message + symbol);

		int numero = 1;
		String nombre = "YAM";
		// Si el simbolo va entre dos enteros NO concatena, solo suma
		System.out.println(nombre + numero);
	}
}
