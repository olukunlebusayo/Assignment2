package com.java.training;

public class Q1 {
	public static void main(String args[]) {
		AClass ref1 = new AClass(5);
		System.out.println(ref1.x);
	}
}

/*
 * remove private modifier from AClass to fix it public class AClass { public
 * int x;
 * 
 * private AClass(int x) { this.x = x; } }
 */