package com.java;

public class Loops {

	public static void main(String[] args) {
		/*Colocar siempre una condición de salida para no ciclar el proyecto. Condiciones:
		 * 1. Por codigo: break; -> Interrumpe la ejecución, podria no cumplir los objetivos del ciclo.
		 * 2. Por logica: cuando ya no se cumpla la condición.
		 * El do primero lo hace y despues valida while. El while primero valida */
		
		// WHILE

		// Contador de un rango de numeros

		int minNumero = 3;
		int maxNumero = 100;

		while (minNumero <= maxNumero) {
			System.out.println("El numero es: " + minNumero);
			minNumero++;
		}

		// DO WHILE

		// ¿Cuantas veces se tiene que sumar un mismo para llegar a 100?
		int numero = 50;
		int sumTotal = 0;
		int count = 0;

		do {
			sumTotal = sumTotal + numero;
			count++;
		} while (sumTotal < 100);

		System.out.println("El numero se sumo a si mismo: " + count);

		// FOR (declaracion de inicializador, condicion, contador)

		// Contador de un numero limite

		int numeroLimite = 10;

		for (int i = 1; i <= numeroLimite; i++) {
			System.out.println("El numero FOR es " + i);

		}
	}
}
