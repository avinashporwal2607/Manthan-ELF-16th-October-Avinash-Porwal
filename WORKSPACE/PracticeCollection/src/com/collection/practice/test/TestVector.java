package com.collection.practice.test;

import java.util.Vector;

public class TestVector {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("avinash");
		v.add(25);
		v.add(9.89);
		v.add("rahul");
		v.add(null);
		for(Object o1:v)
		{

			System.out.println(o1);
		}
		System.out.println("VECTOR");

	}
}
