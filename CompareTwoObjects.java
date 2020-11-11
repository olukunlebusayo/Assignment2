package com.java.training;

// the class name is CompareTwoObjects
public class CompareTwoObjects {
	String name;
	int rollNumber;
	int Class;
	
	// parameterized constructor here. There will be no need for obj.variable_names every time
	public CompareTwoObjects(String name, int rollNumber, int Class) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.Class = Class;

	}
	
	/*
	
	This is a method to handle the comparison of the individual elements of the two objects
	the method returns true if the elements are the same and false otherwise
	
	*/
	public static boolean isEqual (CompareTwoObjects student1, CompareTwoObjects student2) {
		
		return (student1.name == student2.name) &&
				(student1.rollNumber == student2.rollNumber) &&
				(student1.Class == student2.Class);
	}
	
	// main method here. objects are created, compared, and result printed
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompareTwoObjects student1 = new CompareTwoObjects("Nike", 1, 1);
		CompareTwoObjects student2 = new CompareTwoObjects("Nike", 1, 1);
		
		//boolean isEqual = student1.equals(student2);
		
		if (isEqual(student1, student2)) {
			System.out.println("The two objects are equal");
		}
		else {
			System.out.println("The two objects are different");
		}
	}

}
