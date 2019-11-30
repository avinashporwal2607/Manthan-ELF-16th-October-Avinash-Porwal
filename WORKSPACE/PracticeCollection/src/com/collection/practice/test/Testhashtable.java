package com.collection.practice.test;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Testhashtable {
	public static void main(String[] args) {
		Hashtable<Integer, String> h=new Hashtable<Integer, String>();
		h.put(1, "avinash");
		h.put(2, "devendra");
		h.put(16, "porwal");
		h.put(89, "ram");
		h.put(14, "aashish");
		System.out.println(h.get(1));
		Set<Map.Entry<Integer, String>> se=h.entrySet();
		System.out.println("*****for each loop fetching data by hash table******");
		for(Map.Entry<Integer, String> m:se)
		{
			System.out.println(m.getValue());
			System.out.println(m.getKey());
		}
		System.out.println("-----------------------------------");
		Iterator <Map.Entry<Integer, String>>it=se.iterator() ;
		{
		while(it.hasNext()) {
			System.out.println(it.next());
			//System.out.println(it.next().getValue());
		}
		
	}
		
		
		
		
	}
}
	


