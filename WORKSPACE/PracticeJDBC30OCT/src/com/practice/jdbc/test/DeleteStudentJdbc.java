package com.practice.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteStudentJdbc {
	public static void main(String[] args) {
		System.out.println("enter the delete student id ");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();

		Connection con=null;
		PreparedStatement pstmt=null;
	
		try {
			Class.forName("com.mysql.jdbc.Driver");//load the driver
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students?user=root&password=root");//get the connection
			pstmt=con.prepareStatement("delete from student_info where id=?");//prepare statement
			
			 pstmt.setInt(1, id);
			int	 rs=pstmt.executeUpdate();
			
			if(rs>0)
			{
				System.out.println("deleted record sucessfully");
			}
			else
			{
				System.out.println("record not deleted");
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}//end of outer catch block
		
		finally {
			if(con !=null)
			{
				try
				{
					con.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
				}//end of inner catch block
			}
			if(pstmt!=null)
			{
				try
				{
					pstmt.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
				}//end of inner catch block
			}
		}//end of finally block
		
	}//end of main
}//end of class
