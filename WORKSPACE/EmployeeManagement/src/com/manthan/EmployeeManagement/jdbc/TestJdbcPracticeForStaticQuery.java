//note : there should be no gap between user and password they should concat eachother by & symbol.
package com.manthan.EmployeeManagement.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class TestJdbcPracticeForStaticQuery {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students?user=root&password=root");//
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from student_info ");
			while(rs.next())
			{
				int id1=rs.getInt("id");
				Logger log=Logger.getLogger("myLoger");
				log.info("student id is "+id1);
				//System.out.println("student id is "+id1);
				String name=rs.getString("name");
				System.out.println("student name is "+name);
				int age =rs.getInt("age");
				System.out.println("student age is "+age);
				String s=rs.getString("sex");
				System.out.println("student gender is "+s);
				long mo=rs.getLong("mobi");
				System.out.println("student mobile number is "+mo);
				int clss=rs.getInt("class");
				System.out.println("student class is "+clss);
				System.out.println("-----------------------------------------");


			}
		} catch (Exception e) 
		{

			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(rs!=null)
				{
					rs.close();
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
			
			try
			{
				if(stmt!=null)
				{
					stmt.close();
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
			
			try
			{
				if(con!=null)
				{
					con.close();
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}//end of finally block

	}//end of main
}//end of class
