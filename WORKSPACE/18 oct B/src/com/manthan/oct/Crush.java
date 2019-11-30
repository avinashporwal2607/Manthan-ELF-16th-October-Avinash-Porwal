package com.manthan.oct;

public class Crush {

	void receive(Phone p)
	{
		if( p instanceof Mi )
		{
			System.out.println("thank u bro");
		}
		else if(p instanceof Pixel)
		{
			System.out.println("thank u dear");
		}
		else if(p instanceof Iphone)
		{
			System.out.println("I LOVE YOU");
		}
		else
		{
			System.out.println("NON SENCE");
		}
	}
}
