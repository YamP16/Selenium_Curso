package com.java.Ejercicios;

public class MegaBytes {

	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(60000);
	}

	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		int XX, YY, ZZ;
		XX = kiloBytes; // KB
		YY = kiloBytes / 1024; // MB
		ZZ = kiloBytes % 1024; // Remaining
		
		if (kiloBytes <= 0) {
			System.out.println("Invalid Value");
		} else {
			System.out.println(XX + " KB = " + YY + " MB and " + ZZ + " KB");
		}
	}
}
