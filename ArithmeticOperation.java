/*
 Assignment 2
 */

package com.java.training;

public class ArithmeticOperation{
	
	static int a = 30;
	static int b = 5;
	
	// main method here
	public static void main(String[] args) {
		
		int sum = Addition();
		int sub = Subtraction();
		int mult = Multiplication();
		double div = Division();
		
		System.out.println("a = " +a+" " +"b = " +b);
		System.out.println("The Sum of a and b is: " + sum);
		System.out.println("Subtracting b from a is: " + sub);
		System.out.println("The product of a and b is: " + mult);
		System.out.println("Dividing a by b is: " + div);
	}
	
	// addition ops here
	public static int Addition() {
		
		int sum = a + b;
		return sum;
		
	}
	
	// subtraction ops here
	public static int Subtraction() {
		
		int Sub = a - b;
		return Sub;
		
	}
	
	// multiplication ops here
	public static int Multiplication() {
		
		int mult = a * b;
		return mult;
		
	}
	
	// division ops here
	public static double Division() {
		
		double div = a / b;
		return div;
		
	}
}