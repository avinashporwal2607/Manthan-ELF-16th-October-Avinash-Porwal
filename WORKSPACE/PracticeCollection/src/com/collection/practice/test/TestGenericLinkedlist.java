package com.collection.practice.test;

import java.util.LinkedList;
import java.util.ListIterator;

public class TestGenericLinkedlist {
	public static void main(String[] args) {
		LinkedList<Double> LI=new LinkedList<Double>();
		LI.add(4.7);
		LI.add(7.6);
		LI.add(7.4);
		LI.add(8.76);
		LI.add(9.75);
		ListIterator<Double> it=LI.listIterator();
		System.out.println("*********generic double liked list");
		while(it.hasNext())
		{
			Double o=it.next();
			System.out.println(o);
		}
		System.out.println("**********fetching by for loop************");
		for (int  i= 0;  i< LI.size(); i++)
		{
			Object o=LI.get(i);
			System.out.println(o);
		}
		System.out.println("*********fetchig by for each loop***********");
		for(Double o:LI)
		{
			System.out.println(o);
		}
		System.out.println("*****FETCHING BACKWORD DATA BY HAS PRIVIOUS******");
		ListIterator<Double> it1=LI.listIterator(LI.size());
		while(it1.hasPrevious())
		{
			Object d=it1.previous();
			System.out.println(d);
		}
	}
}
