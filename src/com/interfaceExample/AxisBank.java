package com.interfaceExample;

public class AxisBank implements RBIBank,Bank{

	@Override
	public void currentAcc() {
	int currentInt=10;	
	System.out.println(currentInt);	
	}

	@Override
	public void recurDeposit() {
	int recurInt=5;
	System.out.println(recurInt);
		
	}

	@Override
	public void savingsAcc() {
		int savingsInt=7;	
		System.out.println(savingsInt);
	}

	@Override
	public void fixedDeposit() {
	int fixedInt=9;
	System.out.println(fixedInt);
		
	}
	public static void main(String[] args) {
	AxisBank b=new AxisBank();
	b.fixedDeposit();
	b.currentAcc();
	b.savingsAcc();
	b.fixedDeposit();
	}

}
