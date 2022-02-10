package com.java.Ejercicios;

public class VerificadorNumeros { //COMPARACION DE NUMEROS
	
	public static void main(String[] args) {
		imprimirVerificadorNumero(1, 2, 3); 
	}

	public static void imprimirVerificadorNumero(int x, int y, int z) {

		if (x < 0 || y < 0 || z < 0) {
			System.out.println("VALOR NO VALIDO");
		} else if (x == y && y == z && z == x) {
			System.out.println("TODOS LOS NUMEROS SON IGUALES");
		} else if (x != y && y != z && z != x) {
			System.out.println("TODOS LOS NUMEROS SON DIFERENTES");
		} else {
			System.out.println("NI TODOS SON IGUALES NI DIFERENTES");
		}
	}
}