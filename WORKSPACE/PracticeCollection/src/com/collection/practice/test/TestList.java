//programm for normal ArrayLIST
package com.collection.practice.test;

import java.util.ArrayList;
import java.util.Iterator;

public class TestList {
	public static void main(String[] args) {
		ArrayList AL=new ArrayList();
		AL.add("AVINASH");
		AL.add(786);

		AL.add(9.75);
		AL.add('M');
		AL.add(5.6F);
		System.out.println("***************fetching list by FOR LOOP**********");
		for(int i=0;i<AL.size();i++)
		{
			Object o=AL.get(i);
			System.out.println(o);
		}
		System.out.println("***************fetching data by FOR EACH LOOP*********");
		for(Object o:AL)
		{
			System.out.println(o);
		}
		System.out.println("*************fetching data by Iterator************");
		Iterator it=AL.iterator();
		while(it.hasNext())
		{
			Object o =it.next();
			System.out.println(o);
		}

	}
}
