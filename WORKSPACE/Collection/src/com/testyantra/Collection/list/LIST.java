package com.testyantra.Collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class LIST {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(5);
		al.add(2.4);
		al.add("rahul");
		al.add('a');
		ListIterator l = al.listIterator();
		while(l.hasNext())
		{
			Object r = l.next();
			System.out.println(r);
			
		}
		while(l.hasPrevious())
		{
			Object t=l.previous();
			System.out.println(t);
		}
	}

}
