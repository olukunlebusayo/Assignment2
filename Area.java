package com.java.training;

public class Area {
	
	static final double pi = 3.142;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double area = AreaOfCircle(5.0);
		System.out.println("Area of a circle with radius of 5 is: " + " " + area);

	}
	
	public static double AreaOfCircle(double r) {
		return pi * r * r;
		
	}

}
