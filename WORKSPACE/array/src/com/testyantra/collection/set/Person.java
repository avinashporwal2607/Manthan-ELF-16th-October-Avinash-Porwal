package com.testyantra.collection.set;

public class Person implements Comparable<Person> //here we have to implement comparable interface user dedine class
{
	int id;
	String name;
	double hegiht;
	public Person(int id, String name, double hegiht) {

		this.id = id;
		this.name = name;
		this.hegiht = hegiht;
	}
	
	
	/*
	 * public int compareTo(Person x)// { if(this.id>x.id) { return 1; } else if
	 * (this.id<x.id) { return -1; } else { return 0; }
	 */

	//	public int compareTo(Person x)
	//	{ if(this.hegiht>x.hegiht)
	//	{
	//		return 1;
	//	} 
	//	else if
	//	(this.hegiht<x.hegiht) 
	//	{ return -1; } 
	//	else 
	//	{ return 0; 
	//	}

	public int compareTo(Person x)
	{
		return this.name.compareTo(x.name);


	}
}
