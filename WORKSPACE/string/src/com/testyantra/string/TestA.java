package com.testyantra.string;

public class TestA {
	public static void main(String[] args) {
		String s="dimple";
		int i=s.length();
		System.out.println(i);
		String k="raju";
		String t="priya";
		System.out.println(k==t);
		String p="priya";
		System.out.println(p.equals(t));
		String m=new String("priya");
		System.out.println(t.equals(m));
	}
}
