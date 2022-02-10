package com.java.Ejercicios;

public class Decimal {

	public static void main(String[] args) {
		System.out.println(areEqualByThreeDecimalPlaces(8.908, 8.90));
	}
	public static boolean areEqualByThreeDecimalPlaces (double x, double y) {
		int num1 = (int) (x*1000); //Se usa casting para convertir de double a int y se multiplica por 1000 
		int num2 = (int) (y*1000); // porque se consideran 3 digitos
		
		if (num1==num2) {return true;
		}else {return false;}
	}
}
