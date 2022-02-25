package com.java.Ejercicios.extra;

public class AñoBisiesto {

	public static void main(String[] args) {
		System.out.println(isLeapYear(2020));

	}

	// Es año bisiesto
	public static boolean isLeapYear(int year) {

		if (year >= 1 && year <= 9999) {
			int res1 = year % 4;
			int res2 = year % 100;
			int res3 = year % 400;

			if (res1 == 0) {
				if (res2 == 0) {
					if (res3 == 0) {
						return true; // is leap year
					} else {
						return false; // is not leap year
					}
				} else {
					return true; // is leap year
				}
			} else {
				return false; // is not leap year
			}
		} else {
			return false;
		}
	}
}
