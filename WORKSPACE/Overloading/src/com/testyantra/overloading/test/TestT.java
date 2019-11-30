package com.testyantra.overloading.test;

public class TestT {
public static void main(String[] args) {
	Person p=new Person();
	Mobile m=new Mobile();
	p.age=24;
	System.out.println("man age is"+p.age);
	p.walk();
	p.m.model=3310;//Has a relationship with object
	System.out.println("model name is"+p.m.model);
	p.m.doCall();
}
}
