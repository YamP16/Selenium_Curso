package com.java;

import java.util.Scanner;  //Importar clase Scanner para poder usar la funcion Scanner

// Tipos de entradas mediante el teclado 
// String nombre = sc.nextLine(); ->Entrada de Cadena
// char genero = sc.next().charAt(0); -> Entrada de caracter
// int edad = sc.nextInt(); -> Entrada de entero
// long mobileNo = sc.nextLong(); -> Entrada de entero
// double promedio = sc.nextDouble(); -> Entrada de decimal

public class Ejercicio5 {

	public static void main(String[] args) {
		// Solicita numero y valida si es positivo o negativo e par o impar
	
		Scanner addN=new Scanner(System.in); 		//Parametro que indica entrada de datos por teclado => system.in
	
		System.out.println("Ingresa un  número:");  //Solicitar numero
		double num=addN.nextDouble();               //Guardar entrada en variable num
		
		//Positivo o Negativo
			if (num < 0) {
				System.out.println("Número Negativo");
			}else {
				System.out.println("Número Positivo");
			}
		
		//Par e Impar
		double residuo= num%2; //El operador % devuelve el residuo de una división
		
			if (residuo==0) {
				System.out.println("Número Par");
			}else {
				System.out.println("Número Impar");
			}
	}
}
