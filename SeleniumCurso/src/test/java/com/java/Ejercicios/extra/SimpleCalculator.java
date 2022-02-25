package com.java.Ejercicios.extra;

public class SimpleCalculator {
	
	double firstNumber;
	double secondNumber;
	
	//Constructor:Mediante el cual se le pasan valores al objeto
	public SimpleCalculator(double firstNumber, double secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	
	public SimpleCalculator() {};
	
	//Getters and setters (they allow to get access to the parameters if are private)
	
	public double getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}
	public double getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	//Other methods
	public double getAdditionResult() { 
		return firstNumber + secondNumber; //suma
	}
	
	public double getSubtractionResult() {
		return firstNumber - secondNumber; //resta
	}
	
	public double getMultiplicationResult() {
		return firstNumber * secondNumber; //Multiplicacion
	}
	
	public double getDivisionResult() {
		if (secondNumber == 0 ) { return 0;}
		else {return firstNumber / secondNumber;} //Division
	}
}
