package com.manthan.exception.test;

public class Paytm {
	void book()
	{
		System.out.println("book started");

		Irctc i=new Irctc();
		try {
		i.confirm();
		}
		catch(ArithmeticException A)
		{
			System.out.println("caught at book");
		}
		finally
		{
		System.out.println("book ended");
		}

	}
}
