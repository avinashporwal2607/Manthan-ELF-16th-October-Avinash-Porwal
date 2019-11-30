package com.testyantra.lamda;

public class TestSI {
	public static void main(String[] args) {
		SimpleInterest si= (p,r,t)->(p*r*t)/100;
		
		double t=si.sI(5,12,100);
		System.out.println(t);
	}

}
