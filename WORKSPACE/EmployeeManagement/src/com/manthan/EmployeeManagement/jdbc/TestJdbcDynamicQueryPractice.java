package com.manthan.EmployeeManagement.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TestJdbcDynamicQueryPractice {
	public static void main(String[] args) {
		System.out.println("input the delete id number");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		Connection con=null;
		PreparedStatement pstmt=null;
			int rs1=0;
	//	int rs=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/students";
			con=DriverManager.getConnection(dburl, "root", "root");
			pstmt=con.prepareStatement("delete from student_info where id=?");
			
					pstmt.setInt(1,input);
			rs1=pstmt.executeUpdate();
			if(rs1>0)
			{
				System.out.println("record is deleted");
			}
			else
			{
				System.out.println("not deleted");
			}

		} //end of the try block
		catch (Exception e) {
			e.printStackTrace();
		}//end of catch block
		finally
		{
			try
			{
				if(pstmt!=null)
				{
					pstmt.close();
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
		}//end of the finally block


	}//end of the main

}//end of the class
