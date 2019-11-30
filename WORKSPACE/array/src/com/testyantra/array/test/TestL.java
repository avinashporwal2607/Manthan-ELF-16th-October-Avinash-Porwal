package com.testyantra.array.test;

public class TestL {
	public static void main(String[] args) {
		int x[]= {1,2,9,6,2};
		Demo d=new Demo();
		d.eat(x);
		double d1[]=d.getMe();
		for(double t:d1)
		{
			System.out.println(t);
		}
	}


}
