package com.java.Ejercicios.extra;

public class MainPerson {
	
	public static void main(String[] args) {
	//Create object person
	Person per1 = new Person(); 
	// Declaración de la variable per1 de tipo Person antes del =
	//Creación de un objeto de la clase Person despues del =
	
	//Accediendo a los getters and setters
	
	per1.setFirstName("");   // firstName is set to empty string
	per1.setLastName("");    // lastName is set to empty string
	per1.setAge(10);
	System.out.println("fullName= " + per1.getFullName());
	System.out.println("teen= " + per1.isTeen());
	per1.setFirstName("John");    // firstName is set to John
	per1.setAge(18);
	System.out.println("fullName= " + per1.getFullName());
	System.out.println("teen= " + per1.isTeen());
	per1.setLastName("Smith");    // lastName is set to Smith
	System.out.println("fullName= " + per1.getFullName());
	}
}
