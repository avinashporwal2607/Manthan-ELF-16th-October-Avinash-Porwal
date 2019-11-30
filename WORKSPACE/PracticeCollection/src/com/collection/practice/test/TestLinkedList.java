package com.collection.practice.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkedList {
public static void main(String[] args) {
	LinkedList LI=new LinkedList();
	LI.add("Cricket");
	LI.add(452);
	LI.add("virat kohli");
	LI.add(59.2);
	LI.add(11);
	System.out.println("************fetching information by for loop*********");
	for(int i=0;i<LI.size();i++)
	{
		Object o=LI.get(i);
		System.out.println(o);
	}
	System.out.println("*********fetching data by for each loop**********");
	for(Object o:LI)
	{
		System.out.println(o);
	}
	System.out.println("************backword fetching data by linklist iterator********");
	ListIterator it=LI.listIterator(LI.size());
	while(it.hasPrevious())
	{
		Object o=it.previous();
		System.out.println(o);
	}
	System.out.println("**************FOrward data fetching by linked list iterator******");
	ListIterator it1=LI.listIterator();
	while(it1.hasNext())
	{
		Object o=it1.next();
		System.out.println(o);
	}
}

}
