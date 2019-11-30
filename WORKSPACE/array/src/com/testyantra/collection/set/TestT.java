package com.testyantra.collection.set;

import java.util.HashSet;

public class TestT {
	public static void main(String[] args) {

		HashSet<Person> h=new HashSet<Person>();
		Person p=new Person(1, "avi",5.9);
		Person p1=new Person(1, "avi",5.9);//hash 
		Person p2=new Person(2, "rahul",6.9);
		Person p3=new Person(3, "divya",5.5);

		h.add(p);
		h.add(p1);
		h.add(p2);
		h.add(p3);

		for(Person u:h)
		{
			System.out.println(u.id);
			System.out.println(u.name);
			System.out.println(u.hegiht);
		}
	}
}




