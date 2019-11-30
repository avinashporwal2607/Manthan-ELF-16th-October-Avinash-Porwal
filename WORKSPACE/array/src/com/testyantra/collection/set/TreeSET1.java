package com.testyantra.collection.set;

import java.util.TreeSet;

public class TreeSET1 {
	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<String>();
		t.add("AVINASH");
		t.add("AVINASH");
		t.add("DIVYA");
		t.add("divya");
		t.add("DIMPLE");
		t.add("SIMRAN");
		for(Object o :t)
		{
			System.out.println(o);
		}
		System.out.println("***************for user define person class");
		TreeSet<Person> t1=new TreeSet<Person>();//tree set shoud be comparable with 
		Person p=new Person(1, "avi",5.9);
		Person p1=new Person(2, "avi",5.9);//hash 
		Person p2=new Person(3, "rahul",6.9);
		Person p3=new Person(4, "divya",5.5);
		t1.add(p);
		t1.add(p1);
		t1.add(p2);
		t1.add(p3);

		for(Person t2:t1)
		{
			System.out.println("will print "+t2.name);
		}

	}

}
