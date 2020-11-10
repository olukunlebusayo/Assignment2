package com.java.training;

public class ObjectDemo {
	String name;
	int age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// first object
		ObjectDemo first_student = new ObjectDemo();
		first_student.name = "Divine Olukunle";
		first_student.age = 18;
		
		// second object
		ObjectDemo second_student = new ObjectDemo();
		second_student.name = "Mercy Olukunle";
		second_student.age = 20;
		
		// third object
		ObjectDemo third_student = new ObjectDemo();
		third_student.name = "Goodness Olukunle";
		third_student.age = 22;
		
		// fourth object
		ObjectDemo fourth_student = new ObjectDemo();
		fourth_student.name = "Glory Olukunle";
		fourth_student.age = 24;
		
		// fifth object
		ObjectDemo fifth_student = new ObjectDemo();
		fifth_student.name = "Purity Olukunle";
		fifth_student.age = 26;
		
		System.out.println("student 1 - " + "name: " + first_student.name + " "+ "age: "+ first_student.age);
		System.out.println("student 2 - " + "name: " + second_student.name + " "+ "age: "+ second_student.age);
		System.out.println("student 3 - " + "name: " + third_student.name + " "+ "age: "+ third_student.age);
		System.out.println("student 4 - " + "name: " + fourth_student.name + " "+ "age: "+ fourth_student.age);
		System.out.println("student 5 - " + "name: " + fifth_student.name + " "+ "age: "+ fifth_student.age);

	}

}
