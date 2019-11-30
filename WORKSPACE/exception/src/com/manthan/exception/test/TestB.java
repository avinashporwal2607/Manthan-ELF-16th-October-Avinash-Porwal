package com.manthan.exception.test;

public class TestB {
	public static void main(String[] args) {
		System.out.println("MAIN STARTED");
		String s=null;
		try
		{
			System.out.println(s.length());
		}
		catch (NullPointerException Ne) {
			System.out.println("PLEASE DONT DEAL WITH NULL");
		}
		System.out.println("MAIN ENDED NORMALLY");
	}
}
