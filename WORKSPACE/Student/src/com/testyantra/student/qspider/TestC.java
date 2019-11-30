package com.testyantra.student.qspider;

import com.testyantra.student.jspider.Demo;//non static work with object
import static com.testyantra.student.jspider.Demo.*;//here * work for static memmebr

public class TestC {
	public static void main(String[] args) {
		
		Demo d=new Demo();
		System.out.println(d.cost);
	 run();
	 d.eat();
		
	}
	
	
	


}
