package com.practice.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class TestJDBC {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students?user=root & password=root");
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from student_info");
			while(rs.next())
			{
				int id=rs.getInt("id");
				String name=rs.getString("name");
				int age=rs.getInt("age");
				int mobi=rs.getInt("mobi");
				String s=rs.getString("sex");
				int c =rs.getInt("class");
				System.out.println("student id is"+id);
				System.out.println("student name is"+name);
				System.out.println("student age is "+age);
				System.out.println("student mobile no is "+mobi);
				System.out.println("student gender  is "+s);
				System.out.println("student calss is"+c); 
			}


		} catch (Exception e) {

			e.printStackTrace();

		}
		finally
		{
			if(rs!=null)
			{
				try
				{
					rs.close();
				}
				catch(SQLException s)
				{
					s.printStackTrace();
				}
			}
			if(stmt!=null)

			{
				try {
					stmt.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null)
			{
				try

				{
					con.close();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}


		}

	}
}
