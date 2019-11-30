package com.testyantra.collection.set;

import java.util.LinkedHashSet;

public class hasGeneric {
	public static void main(String[] args) {
		LinkedHashSet<String> lh=new LinkedHashSet<String>();//HASH SET ONLY GIVE SORTING ORDER
		lh.add("ROOM");
		lh.add("AVI");
		lh.add("rahul");
		lh.add("VISHAL");
		lh.add(null);
		for(Object o2:lh)
		{
			System.out.println(o2);

		}

	}
}
