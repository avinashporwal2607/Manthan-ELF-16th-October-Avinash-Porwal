package com.testyantra.Collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestY {
	public static void main(String[] args) {
		ArrayList<Double>al=new ArrayList<Double>();
		al.add(2.4);
		al.add(5.8);
		al.add(3.6);
		al.add(4.1);
		//Iterator<Double> it=al.iterator();
		ListIterator<Double> li=al.listIterator();
		while(li.hasNext())
		{
			Double d2=li.next();
			System.out.println(d2);
		}
		while(li.hasPrevious())
		{
			Double D1=li.previous();
			System.out.println(D1);
		}
		

		/*while(it.hasNext())
		{
			Double D=it.next();
			System.out.println(D);
		}*/
		


	}
}
