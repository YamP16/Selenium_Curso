package com.java;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Operadores Matematicos
		
		double var1, var2, var3;
		var1 = 20.4;
		var2 = 4.6;
		var3 = 100.40;
	
	//Impresion de titulo con salto de l�nea
		System.out.println("Operadores Matem�ticos:"+"\n");
				
	//Suma con concatenaci�n e impresion de resultado
		double suma= var1+var2+var3;
		System.out.println("La suma de "+var1+", "+var2+" y "+var3+" es: "+suma);

	//Resta
		double resta= var1-var2-var3;
		System.out.println("La resta de "+var1+", "+var2+" y "+var3+" es: "+resta);
		
	//Multiplicacion
		double multi= var1*var2*var3;
		System.out.println("La multiplicaci�n de "+var1+", "+var2+" y "+var3+" es: "+multi);
	
	//Division
		double div= var1/var2/var3;
		System.out.println("La divisi�n de "+var1+", "+var2+" y "+var3+" es: "+div);
	}
}
