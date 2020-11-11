package com.java.training;

import java.util.Scanner;

public class CheckEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myscanner = new Scanner(System.in);
		System.out.println("Kindly enter a number:");
		int num = myscanner.nextInt();
		
		int rem = num % 2;
		
		switch (rem) {
		
		case 0:
			System.out.println("The number "+num + " " + "is even");
			break;
			
		default:
			System.out.println("The number "+num + " " + "is odd");
			break;
			
		}
		
		myscanner.close();
		
	}

}
