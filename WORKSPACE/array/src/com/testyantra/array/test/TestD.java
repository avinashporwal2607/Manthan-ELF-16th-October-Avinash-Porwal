package com.testyantra.array.test;

public class TestD {
	public static void main(String[] args) {
		Employee e[]=new Employee[10];
		Employee e1=new Employee("rahul", 457, 35000);
		Employee e2=new Employee("avinash", 879, 80000);
		Employee e3=new Employee("sakshi", 859, 40008);
		Employee e4=new Employee("rahul", 842, 40078);
		Employee e5=new Employee("dev", 421, 78004);
		Employee e6=new Employee("gaurav", 647, 30000);
		Employee e7=new Employee("naman", 564, 20000);
		Employee e8=new Employee("devend", 779, 60000);
		Employee e9=new Employee("aashish", 889, 25000);
		Employee e10=new Employee("mayank", 839, 50000);
		e[0]=e1;
		e[1]=e2;
		e[2]=e3;
		e[3]=e4;
		e[4]=e5;
		e[5]=e6;
		e[6]=e7;
		e[7]=e8;
		e[8]=e9;
		e[9]=e10;
		for(Employee E:e)
		{
			System.out.println(E.toString());
			
		}
		
		


	}
}
