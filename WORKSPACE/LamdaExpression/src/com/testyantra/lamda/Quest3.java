package com.testyantra.lamda;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;
import java.util.function.Supplier;

public class Quest3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("press 1 for ArrayaList");
		System.out.println("press 2 for LinkedList");
		System.out.println("press 3 for vector");
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		
		LinkedList<Integer> li=new LinkedList<Integer>();
		li.add(30);
		li.add(40);
		
		Vector<Integer> v=new Vector<Integer>();
		v.add(50);
		v.add(60);
		
		Supplier<Object> su=()->
		{
			int id=sc.nextInt();
			if(id==1)
			return al;
			else if (id==2) 
				return li;
				else if(id==3)	
					return v;
			return null;
				
			
		};
		Object ob=su.get();
		System.out.println(ob);
		
	}

}
