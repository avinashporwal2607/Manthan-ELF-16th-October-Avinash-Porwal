package com.testyantra.object.test;

public class TestA {
public static void main(String[] args) {
	Student s=new Student("priya",1);
	Student t=new Student("pRiya",1);
	//Car c=new Car();
	//String n=s.toString();
	//System.out.println(n);
	System.out.println(s);	
	boolean b=s.equals(t);
	System.out.println(b);
	int k=s.hashCode();
	int u=s.hashCode();
	System.out.println(k);
	System.out.println(u);
	
}
}
