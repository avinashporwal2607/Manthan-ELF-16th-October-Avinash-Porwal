//pgm for generic array list
package com.collection.practice.test;

import java.util.ArrayList;
import java.util.Iterator;

public class TestGenereicArrayList {
	public static void main(String[] args) {
		ArrayList<String> AL=new ArrayList<String>();
		AL.add(null);
		AL.add("AVINASH");
		AL.add("DEVENDRA");
		AL.add("ANKIT");
		AL.add("AASHISH");
		System.out.println("(**************fetching generic arraylist by iterator************");
		Iterator<String> it=AL.iterator();
		while(it.hasNext())
		{
			Object o=it.next();
			System.out.println(o);
		}
		System.out.println("***************fetching data by for loop**************");
		for(int i=0;i<AL.size();i++)
		{
			Object o=AL.get(i);
			System.out.println(o);
		}
		System.out.println("************data by for each loop****************");
		for(Object o:AL)
		{
			System.out.println(o);
		}

	}

}
