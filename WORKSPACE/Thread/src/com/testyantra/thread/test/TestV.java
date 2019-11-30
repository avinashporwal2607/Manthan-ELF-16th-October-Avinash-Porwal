package com.testyantra.thread.test;

public class TestV {
public static void main(String[] args) {
	
	PVR ref=new PVR();
	User u=new User(ref);
	u.start();
	User u1=new User(ref);
	u1.start();
	
	
	
}
}
