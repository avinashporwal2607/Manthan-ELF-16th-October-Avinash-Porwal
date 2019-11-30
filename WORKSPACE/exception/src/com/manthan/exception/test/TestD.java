package com.manthan.exception.test;

public class TestD {
	public static void main(String[] args) {
		System.out.println("MAIN STARTED");
		Paytm p=new Paytm();
		try {
			p.book();

		}
		catch(ArithmeticException A)
		{
			System.out.println("EXCEPTION CAUGHT AT MAIN");
			
		}

		System.out.println("main ended");
	}
}
