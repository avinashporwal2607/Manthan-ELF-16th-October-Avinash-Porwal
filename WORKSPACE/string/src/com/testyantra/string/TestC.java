package com.testyantra.string;

public class TestC {
public static void main(String[] args) {
	StringBuffer a=new StringBuffer("raju");
	StringBuffer k=new StringBuffer();
	
	System.out.println(a);
	StringBuffer s= k.append("avi");//should be same as object
	System.out.println(s);
}
}
