package com.testyantra.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHash {
	public static void main(String[] args) {
		LinkedHashSet lh=new LinkedHashSet();
		lh.add(5);
		lh.add(2.4);
		lh.add("rahul");
		lh.add("rahul");
		lh.add(null);
		for(Object o2:lh)
		{
			System.out.println(o2);

		}
		Iterator it=lh.iterator();
		System.out.println("***********iterator******");
		while(it.hasNext())
		{
			Object o1=it.next();
			System.out.println(o1);
		}

	}
}
