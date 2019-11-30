package com.testyantra.Collection.list;

import java.util.ArrayList;

public class TestB {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(5);
	al.add(2.4);
	al.add("rahul");
	al.add('a');
	for(Object o:al)
	{
		System.out.println(o);
	}
}
}
