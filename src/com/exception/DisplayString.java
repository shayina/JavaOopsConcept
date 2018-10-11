package com.exception;

public class DisplayString extends MyExceptionClass {

	public static void main(String[] args) {
		String msg="abc";
		if(msg.equals("abc")) {
			try
			
			{
				throw new MyExceptionClass();
				}
			
	
		catch(MyExceptionClass e) {
			e.printStackTrace();
		}
		
		}
	}

}
