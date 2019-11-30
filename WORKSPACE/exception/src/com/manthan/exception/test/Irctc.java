package com.manthan.exception.test;

public class Irctc {
	void confirm()
	{
		System.out.println("confirm started");
		try {
			System.out.println(10/2);
		}
		catch(ArithmeticException A)
		{
			System.out.println("METHOD CAUGHT AT CONFIRM");
			throw A;//this is exception is throw his exception to Paytm so Paytm will also able to print the excpetion 
		}
		finally
		{
			System.out.println("confirm ended");
		}
	}
}

