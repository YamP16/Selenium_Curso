package com.java.Ejercicios.extra;

public class Person { 
	//Instances = object's characteristics 
	private String firstName;
	private String lastName;
	 int age;
	
	//Constructors
	public Person() {};
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName; 
		this.lastName = lastName;
		this.age = age;
	}
	
	//Getters and Setters
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age < 0 || age > 100) {
			age=0;
		}else {this.age = age;}
	  }
	
	//Other methods
	public boolean isTeen() {
		return (age>12 && age <20) ? true:false;
	}
	
	public String getFullName() {
		boolean empty1=firstName.isEmpty();  //Returns true or false
		boolean empty2=lastName.isEmpty(); //Returns true or false
		
		if (empty1==false && empty2 == false) {
			return firstName + " " + lastName;
		}else if (empty1==false && empty2 == true){
			return firstName;
		}else if (empty1==true && empty2 == false){
			return lastName;
		}else {return "";}
	}
}
