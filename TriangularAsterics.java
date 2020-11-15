package com.java.training;

public class TriangularAsterics {

	public static void main(String[] args) {
		char myChar = '*';
		String myString = "";

		int i = 20;

		while (i >= 0) {
			myString += myChar;
			System.out.println(myString);
			i--;
		}

	}

}
