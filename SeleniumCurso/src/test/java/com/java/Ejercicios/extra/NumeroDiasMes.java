package com.java.Ejercicios.extra;

public class NumeroDiasMes {

	public static void main(String[] args) {

		System.out.println(getDaysInMonth(11, 2018));

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
						return false;
					} // is not leap year
				} else {
					return true;
				} // is leap year
			} else {
				return false;
			} // is not leap year
		} else {
			return false;
		}
	}

	public static int getDaysInMonth(int month, int year) {
		int days = 0;

		if (month < 1 || month > 12 || year < 1 || year > 9999) {
			return -1;
		} else {
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			case 2:
				boolean Leap = isLeapYear(year);
				if (Leap == false) {
					days = 28;
					break;
				} else {
					days = 29;
					break;
				}
			}
			return days;
		}
	}
}
