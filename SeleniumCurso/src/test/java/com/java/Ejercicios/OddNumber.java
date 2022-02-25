package com.java.Ejercicios;

public class OddNumber {

	public static void main(String[] args) {
		
		System.out.println(sumOdd(100, 1000));

	}

	public static boolean isOdd(int number) {

		int reminder = number % 2; // reminder operator = %

		if (number > 0 && reminder != 0) {
			return true;
		} else {
			return false;
		}
	}

	public static int sumOdd(int start, int end) {

		int sum = 0;

		if (start > 0 && end > 0 && end >= start) {

			for (int i = start; i <= end; i++) {
				if (isOdd(i)) {
					sum = sum + i;
				}
			}
			return sum;
		} else {
			return -1;
		}
	}
}
