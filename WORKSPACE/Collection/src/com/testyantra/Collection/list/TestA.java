package com.testyantra.Collection.list;

import java.util.ArrayList;

public class TestA {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(5);
		al.add(2.4);
		al.add("rahul");
		al.add('a');
		for(int i=0;i<al.size();i++)
		{
			Object o=al.get(i);//get method for getting index
			System.out.println(o);
		}
	}
}
