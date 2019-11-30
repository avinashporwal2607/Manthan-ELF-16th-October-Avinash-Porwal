package com.manthan.EmployeeManagement.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TesteDelete {
	public static void main(String[] args) {
		System.out.println("enter the delete employee id number");
		Scanner sc=new Scanner(System.in);
		int eid=sc.nextInt();
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db?user=root&password=root");
			pstmt=con.prepareStatement("delete  from employee where emp_id=?");
			pstmt.setInt(1, eid);
			int n=pstmt.executeUpdate();
			if(n>0)
			{
				System.out.println("deleted");
			}
			else
			{
				System.out.println("not deleted");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{



			if(pstmt!=null)
			{
				try {
					pstmt.close();
				} 
				catch (SQLException e)
				{
					e.printStackTrace();
				}

			}
			if(con!=null)
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
