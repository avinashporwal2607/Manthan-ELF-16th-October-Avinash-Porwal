package com.testyantra.lamda;

public class LamdaExpression {
	public static void main(String[] args) {
		Pen p=(i,j)->i+j;//here we can take any varivale name but 
		int  x=p.add(20, 25);
		System.out.println("VALUE IS "+x);
		
	}

}
