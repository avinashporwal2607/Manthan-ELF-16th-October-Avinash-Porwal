package com.testyantra.comparator;

import java.util.Comparator;

import map.Student;

public abstract class StudentById implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
			Integer d1=o1.id;
			Integer d2=o2.id;
			
		return d1.compareTo(d2);
	}
	

	
//	public int compare(Student o1, Student o2)
////	{
////		if(o1.id>o2.id)
////		{
////			return 1;
////		}
////		else if(o1.id<o2.id)
////		{
////			return -1;
////		}
////		else
////			return 0;
////		
	}
	
	


