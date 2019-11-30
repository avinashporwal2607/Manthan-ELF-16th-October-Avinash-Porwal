package com.manthan.exception.test;

import java.io.IOException;

public class TestF {

	public static void main(String[] args)
	{
		Demo d=new Demo();
		try {
			d.run();
			//d.eat();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("MAIN HANDLE");
		}
		
		try
		{
			d.eat();
		}
		catch(ArithmeticException A)
		{
			System.out.println("eat handle");
		}
	}
}
