package com.manthan.exception.test;

import java.io.File;
import java.io.IOException;

public class TestE {
public static void main(String[] args) {
	System.out.println("MAIN STARTED");
	File f=new File("avinash porwal.txt");
	try
	{
		f.createNewFile();
		System.out.println("avinash porwal file created");
	}
	catch (IOException e) {
		System.out.println("SORRY COULD NOT CREATE FILE ");
	}
	System.out.println("MAIN ENDED");
}

}
