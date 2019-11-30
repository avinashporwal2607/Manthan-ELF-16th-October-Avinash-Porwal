package com.manthan.EmployeeManagement.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.jdbc.Driver;

public class TestB {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		int rs=0;//to return delete or update statement in form of 0 and 1
		ResultSet rs1=null;// this is  storing information for whole group of information
		try {
			Class.forName("com.mysql.jdbc.Driver");//load the driver

			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students?user=root&password=root");//protocol:subprotocol:<subname>
			stmt= con.createStatement();
			rs=stmt.executeUpdate("delete from student_info where id=1");//this is static because we know what is id but dynamic means when we taks id from the  user;
			if(rs>0)
			{
				System.out.println("record update");
			}
			else
			{
				System.out.println("not update");
			}
			//System.out.println(rs);
			rs1=stmt.executeQuery("select * from student_info");
			while(rs1.next())
			{
				int id=rs1.getInt("id");
				String name=rs1.getString("name");
				int age=rs1.getInt("age");
				int mobi=rs1.getInt("mobi");
				String s=rs1.getString("sex");
				int c =rs1.getInt("class");
				System.out.println("student id is "+id);
				System.out.println("student name is "+name);
				System.out.println("student age is "+age);
				System.out.println("student mobile no is "+mobi);
				System.out.println("student gender  is "+s);
				System.out.println("student calss is "+c); 
				System.out.println("-----------------------------");
			}


			} catch (Exception e) {

			e.printStackTrace();

		}
		finally
		{
			if(rs1!=null)
			{
				try
				{
					rs1.close();
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


}//end of the class


