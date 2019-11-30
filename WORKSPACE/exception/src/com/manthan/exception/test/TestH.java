package com.manthan.exception.test;

public class TestH {
	public static void main(String[] args) {
		ATMSimulator a=new ATMSimulator();
		System.out.println("main started");
		try {
			a.verify(51000);
		}
		catch(DaylimitException d)
		{
			d.printStackTrace();
		}
		finally
		{
			System.out.println("main ends here");
		}
	}
}
