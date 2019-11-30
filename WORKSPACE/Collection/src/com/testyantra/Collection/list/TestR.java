package com.testyantra.Collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestR {
public static void main(String[] args) {
	LinkedList<String> l=new LinkedList<String>();
	l.add("ram");
	l.add("seeta");
	l.add("laxman");
	l.add("bhrat");
	Iterator<String> I=l.iterator();
	while(I.hasNext())
	{
		String s=I.next();
		System.out.println(s);
	}
	System.out.println("---------------");
	for(String D:l)
	{
		System.out.println(D);
	}
	System.out.println("============");
	for(int i=0;i<l.size();i++)
	{
		Object o=l.get(i);
		System.out.println(o);
	}
	
	
}
}
