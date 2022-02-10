package com.java.Ejercicios;

public class Cat {

	public static void main(String[] args) {
		
		System.out.println(isCatPlaying(false,35));
		
	}
	public static boolean isCatPlaying(boolean verano, int temperatura) {
		
		if (verano == true && temperatura >= 25 && temperatura <= 45) {
			System.out.println("El gato esta jugando, es verano");
			return true;
		}else if (temperatura >= 25 && temperatura <= 35){ //Se ejecuta con false
			System.out.println("El gato esta jugando, no es verano");
			return true;
		}else {   //Se ejecuta con false
			System.out.println("El gato no esta jugando");
			return false;
		}
	}
}
