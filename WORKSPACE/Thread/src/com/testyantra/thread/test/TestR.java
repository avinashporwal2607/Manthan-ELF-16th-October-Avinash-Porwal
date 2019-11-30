package com.testyantra.thread.test;

public class TestR {
	public static void main(String[] args) {
		Pen p=new Pen();
		

		Thread t1=new Thread(p);
		t1.start();
		
		Thread t2=new Thread(p);
		t2.start();
		
		

		
		
	}

}
