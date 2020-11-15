package com.java.training;

import java.util.Scanner;

public class IntegerFactorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");

		int num = sc.nextInt();
		sc.close();
		int fact = num;
		if (num < 2) {
			System.out.println("0! is 1 and 1! is 1. Please enter any number >= 2");
		} else {
			while (num >= 2) {
				fact = fact * (num - 1);
				num--;
			}
			System.out.println("The factorial is: " + fact);
		}
	}
}