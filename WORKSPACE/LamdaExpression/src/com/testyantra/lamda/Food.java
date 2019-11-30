package com.testyantra.lamda;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;
import java.util.function.Supplier;

public class Food {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("press 1 for kurkure");
		System.out.println("press 2 for lays");
		System.out.println("press 3 for Bingo");
		ArrayList<String> al=new ArrayList<String>();
		al.add("Kurkure");
		LinkedList<String> li=new LinkedList<String>();
		li.add("Lays");
		Vector v=new Vector<String>();
		v.add("Bingo");
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
