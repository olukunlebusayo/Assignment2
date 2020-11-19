package com.java.training;

public class Q4 {
	public static void main(String args[]) {
		AClass ref1 = new AClass(5);
		System.out.print(ref1.x);
		AClass ref2 = new AClass(10);
		System.out.print(ref2.x);
	}
}

/*
 * public class AClass { private int x; private int y;
 * 
 * public AClass(int x) { this.x = x; }
 * 
 * public AClass(int y) { this.y = y; } }
 * 
 */