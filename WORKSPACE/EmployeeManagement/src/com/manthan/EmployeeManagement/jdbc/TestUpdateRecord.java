//we have to implement driver interface 
package com.manthan.EmployeeManagement.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TestUpdateRecord {
	public static void main(String[] args) {
		System.out.println("enter the emp id");
		Scanner sc=new Scanner(System.in);
		int eid=sc.nextInt();
		System.out.println("enter the updated mobile number");
		//Scanner sc1=new Scanner(System.in);
		long emobi=sc.nextLong();
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");//1. Loading the driver
			
			//con=DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db?user=root&password=root");
			
			String db="jdbc:mysql://localhost:3306/elf_employee_db";//assign string url to db variable name
			con=DriverManager.getConnection(db, "root", "root");//2.getting the database connection by overloading getConnection method
			
			//3.issue the sql query
			pstmt=con.prepareStatement("update  employee set emp_mobi=? where emp_id=?");
			
			//setting parameter for prepare statement
			pstmt.setLong(1, emobi);
			pstmt.setInt(2, eid);
			
			//4. here chacking the result whether the result updated or not
			int result =pstmt.executeUpdate();
			if(result>0)
			{
				System.out.println("record is update");
			}
			else
				
			{
				System.out.println("not update");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//closing  all conncetions(other wise databases performance will be down)
		finally
		{



			if(pstmt!=null)//performing to sql queries
			{
				try {
					pstmt.close();
				} 
				catch (SQLException e)
				{
					e.printStackTrace();
				}

			}
			if(con!=null)//jdbc to database connection
			{
				try {
					con.close();
				} 
				catch (SQLException e)
				{
					e.printStackTrace();
				}

			}

		}
		
		
	}//end of main

}//end of class
