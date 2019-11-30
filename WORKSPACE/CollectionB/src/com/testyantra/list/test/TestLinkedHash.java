package com.testyantra.list.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TestLinkedHash {
public static void main(String[] args) {
	LinkedHashMap<Character, String> H=new LinkedHashMap<Character, String>();
	H.put('m', "man");
	H.put('b',"apple");
	H.put('a', "anil");
	H.put('f', "fan");
	
	Set<Map.Entry<Character, String>> se=H.entrySet();//entry.set() is already implemented it is like(Set<Map.Entry<KEY, VALUE>>)
	for(Map.Entry<Character, String> L:se)
	{
		System.out.println("value is "+L.getValue());
		System.out.println("key is "+L.getKey());
	}
	
}
}
