package com.testyantra.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {
	public static void main(String[] args) {
		HashSet<String> h=new HashSet<String>();
		h.add("avinash");
		h.add("udit");
		h.add("kunal");
		h.add("vivek");

		System.out.println("**********for each*********");
		for(Object o:h)
		{
			System.out.println(o);
		}
		System.out.println("**************iterator***********");
		Iterator <String>it=h.iterator();
		while(it.hasNext())
		{
			Object o1=it.next();
			System.out.println(o1);
		}

	}
}
