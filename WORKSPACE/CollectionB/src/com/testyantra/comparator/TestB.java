package com.testyantra.comparator;

import java.util.PriorityQueue;

public class TestB {
	public static void main(String[] args) {
		PriorityQueue<Double> p=new PriorityQueue<Double>();
		p.add(6.9);
		p.add(6.2);
		p.add(9.96);
		p.add(2.9);
		for(Double D : p)
		{
			System.out.println(D);
			

		}
		System.out.println(p);
		p.poll();
		System.out.println(p);
		
		

	}

}
