package com.manthan.exception.test;

import javax.crypto.AEADBadTagException;

public class TestC {
	public static void main(String[] args) {
		System.out.println("MAIN STARTED");
		String s=null;
		int a[]=new int[3];
		try {
			System.out.println(a[5]);
			System.out.println(10/0);
			System.out.println("hii");
			System.out.println("have a gud day");
			//System.out.println(s.length());

		}
		catch(ArithmeticException ar)
				
		{
			//System.out.println("airthmetic exception will catch");
			ar.printStackTrace();
			ar.getMessage();
		}
		catch(NullPointerException NE)
		{
			//System.out.println("NULL POINTER WILL CATCH");
			NE.printStackTrace();
			NE.getMessage();
		}
		catch(ArrayIndexOutOfBoundsException aR) {
			System.out.println("DONT GO BEYOND BOUNDARY OF ARRAY");
			aR.printStackTrace();
			aR.getMessage();
		}
		
		//catch(Exception E)
		{
			System.out.println("GENRAL CATCH BLOCK IS HERE");
		}
		System.out.println("MAIN ENDED");

	}
}
