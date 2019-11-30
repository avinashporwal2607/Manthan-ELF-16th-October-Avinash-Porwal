package com.testyantra.lamda;

import java.util.Comparator;

public interface Mystudent {
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
	

}
