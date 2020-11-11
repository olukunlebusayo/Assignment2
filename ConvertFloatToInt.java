package com.java.training;

import java.util.Scanner;

public class ConvertFloatToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myscanner = new Scanner(System.in);
		System.out.println("Kindly enter a floating point number:");
		
		float myFloat = myscanner.nextFloat();
		System.out.println((int)myFloat);
		
		myscanner.close();

	}

}
