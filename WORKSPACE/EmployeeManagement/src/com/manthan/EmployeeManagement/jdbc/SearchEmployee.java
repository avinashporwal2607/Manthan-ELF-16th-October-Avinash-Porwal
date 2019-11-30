//if condition only use when we have to check only one dynamic condition queries
// we can use also statement insteasd of prepared statemnt but  internally database will create new execution plan
package com.manthan.EmployeeManagement.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SearchEmployee {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the employee id");
		int eid=sc.nextInt();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db?user=root&password=root");
			pstmt=con.prepareStatement("select * from employee where emp_id=?");
			
			//stmt=con.createStatement();
			//rs=stmt.executeQuery("select * from employee where emp id= "+eid)//we can take also like this
			pstmt.setInt(1, eid);//column index will be like how many question marks we have set accordingly 
			rs=pstmt.executeQuery();

			if(rs.next())
			{
				System.out.println("employee id is found");
				System.out.println("employee name is "+rs.getString("emp_name"));
				System.out.println("employee  sallery is "+rs.getDouble("emp_salary"));

			}else
			{
				System.out.println("emp id is not found");
			}

		}catch(Exception E)
		{
			E.printStackTrace();
		}

		finally
		{

			if(rs!=null)
			{
				try {
					rs.close();
				} 
				catch (SQLException e)
				{
					e.printStackTrace();
				}

			}
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
}//end of the class
