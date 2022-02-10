package com.java.Ejercicios;

public class SumaNumero {

	public static void main(String[] args) {
		boolean suma2 = hasEqualSum(1, 3, 2);
		System.out.println(suma2);
	}

	public static boolean hasEqualSum(int x, int y, int z) {
		int suma = x + y;

		if (suma == z) {
			System.out.println("Suma = "+suma);
			return true;
		} else {
			System.out.println("Suma = " +suma);
			return false;
		}

	}

}
