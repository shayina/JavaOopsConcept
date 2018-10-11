package com.polymorphism;

public class MethodOverrideExample extends BaseClass{
	@Override
public void sum() {
	int x=5;
	int y=9;
	int sum=x+y;
	System.out.println("sum in override class:"+sum);
}
	public static void main(String[] args) {
		BaseClass b=new MethodOverrideExample();
		b.sum();

	}

}
