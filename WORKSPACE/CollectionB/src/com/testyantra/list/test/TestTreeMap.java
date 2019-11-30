package com.testyantra.list.test;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//import java.util.Map;

public class TestTreeMap {
	public static void main(String[] args) {
		TreeMap<Character, String> tr=new TreeMap<Character, String>();
		tr.put('M',"divya" );
		tr.put('b', "dimple");
		tr.put('u', "simran");
		tr.put('t', "priya");
		Set<Map.Entry<Character, String>> se=tr.entrySet();
		
		for(Map.Entry<Character, String> y:se)
		{	
			char c= y.getKey();
			String t=y.getValue();
			System.out.println("key is "+c);
			System.out.println("value is "+t);
		}
		
		
	}

}
