package com.testyantra.array.test;

public class Testk {
public static void main(String[] args) {
	Student t[]=new Student[4];
	Student t1=new Student("anita",1,56);
	Student t2=new Student("avi",2,45);
	Student t3=new Student("ravi",3,96);
	Student t4=new Student("ram",4,56);
	
	t[0]=t1;
	t[1]=t2;
	t[2]=t3;
	t[3]=t4;
	for( Student k:t)
	{System.out.println(k.name);
	
	}
	
	
}
}
