package com.java.Ejercicios.extra;

public class AreaCalculator {

	public static void main(String[] args) {
		System.out.println(area(4.0));
		
	}
	public static double area(double radious) {
		double areaCir=0.0; 
		
		if (radious > 0.0) {
			areaCir= radious * radious * Math.PI;
			return areaCir;
		 } else {
			 return -1;
		 }
	}
	//overloaded method
	
	public static double area(double x, double y) {
		double areaRec=0.0;
		
		if (x > 0.0 && y > 0.0) {
			areaRec=x*y;
			return areaRec;
		 } else {
			 return -1;
		 }
	}
}
