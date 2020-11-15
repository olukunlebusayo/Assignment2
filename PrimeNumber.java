package com.java.training;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");

		int num = sc.nextInt();
		sc.close();
		int counter = 1;
		for (int i = 2; i <= (num / 2); i++) {
			if (num % i != 0) {
				counter++;
			} else {
				counter--;
				break;
			}
		}
		if (counter == num / 2) {
			System.out.println("The number: " + num + " is a prime");
		} else {
			System.out.println("The number: " + num + " is NOT a prime");
		}
	}
}
