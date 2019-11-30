package com.testyantra.comparator;

import java.util.TreeSet;

public class TestStudentId {
	public static void main(String[] args) {
		StudentById sid=new StudentById();
		TreeSet<Student> t=new TreeSet<Student>(sid);
	Student s=new Student("AVINASH", 1, 9.8);
	Student s1=new Student("DIVYA", 2, 9.2);
	Student s2=new Student("DIMPLE", 8, 7.8);
	Student s3=new Student("SIMRAN", 10, 6.7);
	t.add(s);
	t.add(s1);
	t.add(s2);
	t.add(s3);
	for(Student d:t)
	{
		System.out.println("id is "+d.id);
		System.out.println("name is "+d.name);
		System.out.println("percent is "+d.percent);
		System.out.println("----------------------------------");
	}
	
	}

}
