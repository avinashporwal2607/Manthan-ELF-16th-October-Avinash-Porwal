package com.testyantra.thread.test;

public class TestC {
	public static void main(String[] args) {
		System.out.println("main started");
		TestA a=new TestA();
		a.start();
		System.out.println("main ended");
		
	}

}
