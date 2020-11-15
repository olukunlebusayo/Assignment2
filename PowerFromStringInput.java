package com.java.training;

import java.util.Scanner;

public class PowerFromStringInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter two integers separated by comma. No space");
		String input = sc.nextLine();

		// split the input into its individual element separated by comma
		String[] input_str = input.split(",");

		String a = input_str[0];
		String b = input_str[1];

		// parseInt and valueOf work the same for the Integer wrapper class
		Integer N = Integer.parseInt(a);
		Integer M = Integer.valueOf(b);

		int power = (int) Math.pow(N, M);

		System.out.println("The power of " + N + " to " + M + " is: " + power);

		sc.close();

	}

}
