package com.constructor;

public class ConstructorExample {
public ConstructorExample(int a) {
	System.out.println("overloaded constructor:"+a);
}
public ConstructorExample(int a,double b,String name) {
	double sum=a+b;
	System.out.println(sum);
	System.out.println(name);
}
	public static void main(String[] args) {
		ConstructorExample ex=new ConstructorExample(3,4.5,"abc");
		ConstructorExample ex1=new ConstructorExample(5);
		
	}

}
