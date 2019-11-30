package com.testyantra.Collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestE {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(5);
		al.add(2.4);
		al.add("rahul");
		al.add('a');
		ListIterator l = al.listIterator(0);
		while(l.hasPrevious())
		{
			Object l1 = l.previous();
			System.out.println(l1);
		}
	}

}