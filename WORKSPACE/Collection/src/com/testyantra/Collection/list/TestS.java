package com.testyantra.Collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestS {
public static void main(String[] args) {
	ArrayList<Sudent> al=new ArrayList<Sudent>();
	Sudent s1=new Sudent("ANIL", 2, 5.6);
	Sudent s2=new Sudent("AVINASH", 3, 5.6);
	Sudent s3=new Sudent("PRIYA", 8, 5.6);
	Sudent s4=new Sudent("MANGAL", 9, 5.6);
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	for(int i=0;i<al.size();i++)
	{
		Sudent s=al.get(i);
		System.out.println("name is "+s.name);
		System.out.println("id id "+s.id);
		System.out.println("height is "+s.height);
		System.out.println("-------------------------------");
	}
	for(Sudent o:al)//HERE OUR ARRAY LIST IS STUDENT TYPE SO OUR DATATYPE SHOULD BE ARRAYLIST
	{
	System.out.println(o.id);
	System.out.println(o.name);
	System.out.println(o.height);
	}
	Iterator <Sudent> it=al.iterator();
	while(it.hasNext())
	{
		Sudent s=it.next();
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.height);
		
	}
	
	
}
}
