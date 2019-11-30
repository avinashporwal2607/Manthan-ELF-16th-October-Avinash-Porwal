package com.manthan.EmployeeManagement.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PracticeAddEmployee {
public static void main(String[] args) {
	System.out.println("please enter the students details\n");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the student id");
	int id=sc.nextInt();
	System.out.println("enter the student name");
	String name=sc.next();
	
	System.out.println("enter the student age");
	int age=sc.nextInt();
	System.out.println("enter the student gender");
	String gen=sc.next();
	System.out.println("enter the student mobile number");
	int mobi=sc.nextInt();
	System.out.println("enter the student class");
	int clss=sc.nextInt();
	sc.close();
	
	Connection con=null;
	PreparedStatement pstmt=null;
	int rs=0;
	
	try {
		Class.forName("com.mysql.jdbc.Driver");//loading Driver here
		String url="jdbc:mysql://localhost:3306/students";
		String user="root";
		String password="root";
		con=DriverManager.getConnection(url,user,password);//getting connection here
		String query="insert into student_info values(?,?,?,?,?,?)";
		pstmt=con.prepareStatement(query);//creating prepare statement here
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setInt(3, age);
		pstmt.setString(4, gen);
		pstmt.setInt(5, mobi);
		pstmt.setInt(6, clss);
		rs=pstmt.executeUpdate();//executing result
		if(rs>0)
		{
			System.out.println("student info is updated successfully!!!!!!!!!!");
		}
		else
		{
			System.err.print("Sorry , student info is updated successfully");
		}
	}
	catch(ClassNotFoundException e)//End of try block
	{
		e.printStackTrace();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}//End of outer catch block
	finally {
		if(pstmt!=null)
		{
			try {
				pstmt.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		}
		if(con!=null)
		{
			try {
				con.close();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
		}
	}//End of Finally block
	
}//End of Main method()
}//End of Class
