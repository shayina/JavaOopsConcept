package com.encapsulation;

public class EncapsulationExample {
	String name = "Shayina";
	String loc = "Chennai";
	int id = 1234;

	public void displayName() {
		System.out.println("Name: " + name);
	}

	public void displayId() {
		System.out.println("Id: " + id);
	}

	public void displayLoc() {
		System.out.println("Location: " + loc);

	}

	public static void main(String[] args) {
		EncapsulationExample ex = new EncapsulationExample();
		ex.displayId();
		ex.displayName();
		ex.displayLoc();

	}

}
