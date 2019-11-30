package com.testyantra.list.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestE {
	public static void main(String[] args) {
		HashMap<Character, String> H=new HashMap<Character, String>();
		H.put('m', "man");
		H.put('a',"apple");
		H.put('a', "anil");
		H.put('f', "fan");
		
		Set<Map.Entry<Character, String>> se=H.entrySet();//entry.set() is already implemented it is like(Set<Map.Entry<KEY, VALUE>>)
		for(Map.Entry<Character, String> L:se)
		{
			System.out.println(L.getValue());
			System.out.println(L.getKey());
			
		}
	}

}
