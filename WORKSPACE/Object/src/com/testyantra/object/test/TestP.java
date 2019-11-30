package com.testyantra.object.test;

public class TestP {
public static void main(String[] args) {
	Animal a=new Cow();//UP CASTING
	a.eat();
	a.cost=10;
	System.out.println(a.cost);
	Cow c=(Cow)a;//DOWN CASTING//6
	c.size=5.6;
	System.out.println(c.size);
	c.run();
	//IN JAVA WE NEVER DO FIRST DOWN CASTING THERE SHOULD BE FIRST UPCASTING
}
}
