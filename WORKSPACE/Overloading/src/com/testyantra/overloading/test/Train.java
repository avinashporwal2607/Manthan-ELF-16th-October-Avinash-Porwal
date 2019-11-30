package com.testyantra.overloading.test;

public class Train {
	void search(String name)
	{
		System.out.println("train searching by name "+name);
	}
	void search(int num)
	{
		System.out.println("train searching by number "+num);
	}

}
