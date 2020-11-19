package com.java.training;

public class Q5 {

	public static void main(String args[]) {
		AClass ref1 = new AClass(5, 10);
		System.out.println(ref1.getSum());
	}
}

/*
 * public class AClass { private int x; private int y;
 * 
 * public AClass(int x),int y{ this.x = x; this.y = y; }
 * 
 * public int getSum() { return x + y; } }
 */