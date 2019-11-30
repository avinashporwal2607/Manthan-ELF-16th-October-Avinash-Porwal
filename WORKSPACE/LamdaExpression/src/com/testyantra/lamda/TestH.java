package com.testyantra.lamda;

import java.util.Comparator;
import java.util.TreeSet;




public class TestH {
public static void main(String[] args) {
	Comparator<Student> comid=(o1,o2)->
	{
		
		Integer d1=o1.id;
		Integer d2=o2.id;
		
		return d1.compareTo(d2);
	};
	Comparator<Student> comn=(o1,o2)->
	{
		
		String d1=o1.name;
		String d2=o2.name;
		
		return d1.compareTo(d2);
	};
	Comparator<Student> comp=(o1,o2)->
	{
		
		Double d1=o1.per;
		Double d2=o2.per;
		
		return d1.compareTo(d2);
	};
	
	TreeSet<Student> t=new TreeSet<Student>(Mystudent.comid);
	
	Student s=new Student("AVINASH", 1, 9.8);
	Student s1=new Student("DIVYA", 2, 9.2);
	Student s2=new Student("DIMPLE", 8, 7.8);
	Student s3=new Student("SIMRAN", 10, 6.7);
	t.add(s);
	t.add(s1);
	t.add(s2);
	t.add(s3);
	for(Student g:t)
	{
		System.out.println(g.id);
		System.out.println(g.name);
		System.out.println(g.per);
		
	}
}

}
