package com.manthan.exception.test;

import java.io.File;
import java.io.IOException;

public class Demo {
	void run() throws IOException
	{
		File f=new File("M:/Demo.txt");
		try {
		f.createNewFile();
		System.out.println("DONE");
		
		}
		catch(IOException E)
		{
			System.out.println("IO HANDLE");
			throw E;
		}
	}
	void eat()
	{
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException A)
		{
			System.out.println("AE HANDLE");
		}
	}
}
