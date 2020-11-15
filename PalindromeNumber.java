package com.java.training;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter at least 3-digit numbers");

		Integer num = sc.nextInt();
		String num_str = num.toString();
		sc.close();
		int counter = 0;
		for (int i = 0; i <= (num_str.length() / 2 - 1); i++) {
			if (num_str.charAt(i) == num_str.charAt(num_str.length() - 1 - i)) {
				counter++;
			} else {
				counter--;
				break;
			}
		}
		if (counter == num_str.length() / 2) {
			System.out.println("The number: " + num + " is a palindrome");
		} else {
			System.out.println("The number: " + num + " is NOT a palindrome");
		}
	}
}