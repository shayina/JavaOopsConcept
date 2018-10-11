package com.polymorphism;

public class MethodOverloadExample {
	public void add() {
		int a=5;
		int b=3;
		System.out.println("sum is:"+(a+b));
	}
	public void add(int x, double y) {
		System.out.println("Sum in overloaded method:"+(x+y));
	}
public void add(int i,int j,int k) {
	System.out.println("sum of three numbers:"+(i+j+k));
}
public void add(double y,int x) {
	System.out.println("Sum in changing order:"+(y+x));
}
	public static void main(String[] args) {
		MethodOverloadExample m=new MethodOverloadExample();
		m.add();
		m.add(4,5.7);
		m.add(3, 4, 5);
		m.add(5.7, 4);
		

	}

}
