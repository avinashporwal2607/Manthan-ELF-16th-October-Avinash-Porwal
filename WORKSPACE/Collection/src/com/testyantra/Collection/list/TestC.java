package com.testyantra.Collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(5);
	al.add(2.4);
	al.add("rahul");
	al.add('a');
	Iterator it =al.iterator();
	{
		while(it.hasNext())
		{
				Object o=it.next();
				System.out.println(o);
		}
		
	}
}
}
