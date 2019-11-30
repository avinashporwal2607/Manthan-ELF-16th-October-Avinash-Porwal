package com.testyantra.lamda;

public class TestA {
	public static void main(String[] args) {
		Factorial f= x->
		{
			int i=1;
			for(int j=1;j<=x;j++)
			{
				j=i*1;

				
			}
			return i;
			
		};
		int t=f.fact(5);
		System.out.println(t);
	}
}
