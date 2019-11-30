package com.testyantra.Collection.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class TestO {
public static void main(String[] args) {
	LinkedList li=new LinkedList();
	li.add(23);
	li.add(2.4);
	li.add('f');
	li.add("priya");
	ListIterator L=li.listIterator();
	ListIterator L1=li.listIterator(li.size());
	System.out.println("FORWARD DIRECTION");
	while(L.hasNext())
	{
		Object o=L.next();
		System.out.println(o);
		
	}
	System.out.println("backward direction");
	while(L1.hasPrevious())

	{
		Object o1=L1.previous();
		System.out.println(o1);
	}
	
	
	
}
}
