package com.testyantra.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA {
	public static void main(String[] args) {
		HashSet h=new HashSet ();
		h.add(5);
		h.add(2.4);
		h.add("rahul");
		h.add('a');
		System.out.println("*************FOR EACH");
		for(Object o:h)
		{
			System.out.println(o);
		}
		System.out.println("++++++++++++++for iterator");
		Iterator it=h.iterator();
		while(it.hasNext())
		{
			Object m=it.next();
			System.out.println(m);
		}
	}
}

