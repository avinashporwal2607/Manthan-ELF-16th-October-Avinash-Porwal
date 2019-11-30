package com.testyantra.lamda;

import java.util.Scanner;

public class quest20 {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int ele=sc.nextInt();
		try
        { 
			if(ele<70)
			{
				System.out.println("student is valid");
				throw new MyException(); 
			}
           
            
        } 
        catch (MyException ex) 
        { 
            
             
            System.out.println("my create exception caught");
            
        } 
	}

}
