package com.manthan.exception.test;

public class Testg {
public static void main(String[] args) {
	AgeSimulator a = new AgeSimulator();
	System.out.println("MAIN START");
	try {
		a.verify(12);
	} catch (InvalidAgeException e) {
		
		e.printStackTrace();
	}

	
}
}
