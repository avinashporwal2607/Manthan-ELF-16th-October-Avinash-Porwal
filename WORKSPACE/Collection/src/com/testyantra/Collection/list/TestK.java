package com.testyantra.Collection.list;

import java.util.Iterator;
import java.util.Vector;

public class TestK {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add('A');
		v.add(2.4);
		v.add(15);
		v.add("DEEPA");
		for(int i=0;i<v.size();i++)
		{
			Object o=v.get(i);
			System.out.println(o);
		}
		System.out.println("for each");
		for(Object o:v)
		{
			System.out.println(o);
		}
		System.out.println("=======");
		Iterator it=v.iterator();
		while(it.hasNext())
		{
		 Object p=it.next();	
		 System.out.println(p);
		}
	}

}
