package com.testyantra.list.test;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class TestC {
	public static void main(String[] args) {
		Collection <Double> AL=new ArrayList<Double>();
		AL.add(2.5);
		AL.add(4.6);
		AL.add(7.8);
		AL.add(5.3);
		//Collection.sort(AL);
		Iterator<Double> it=AL.iterator();
		while(it.hasNext())
		{
			
			Double d=it.next();
			System.out.println(d);
			
		}
		
	}
	
}
