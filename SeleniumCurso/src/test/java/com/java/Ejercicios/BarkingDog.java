package com.java.Ejercicios;

public class BarkingDog {

	public static void main(String[] args) {

		boolean result = shouldWakeUp(true, -8);
		System.out.println(result);

	}
	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

		if (hourOfDay < 0 || hourOfDay > 23) {
			System.out.println("Time out of range");
			return false;
		}
		if (barking == true && hourOfDay < 8 || hourOfDay > 22) {
			System.out.println("Wake up the dog");
			return true;
		} else {
			return false;
		}
	}
}