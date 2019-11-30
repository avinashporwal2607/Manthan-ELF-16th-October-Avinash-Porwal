package com.testyantra.overloading.test;

public class TestB {
public static void main(String[] args) {
	Student s=new Student();
	s.setId(54);
	s.setName("avinash");
	Demo d =new Demo();
	d.save(s);
}
}
