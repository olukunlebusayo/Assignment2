package com.java.training;

public class AClass {
	int x;
	private int i;
	private int j;

	public AClass(int x) {
		this.x = x;
	}

	public AClass(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}

	public int getSum() {
		// TODO Auto-generated method stub
		int sum = i + j;
		return sum;
	}
}