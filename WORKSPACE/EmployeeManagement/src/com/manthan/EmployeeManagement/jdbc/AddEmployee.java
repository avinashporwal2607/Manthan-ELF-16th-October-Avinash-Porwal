package com.manthan.EmployeeManagement.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Logger;

public class AddEmployee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Logger log=Logger.getLogger("mylogger");
		log.info("enter emp id: ");
		
		
		int eid=sc.nextInt();
		sc.nextLine();
		log.info("enter the emp name: ");
		String ename=sc.nextLine();
		log.info("enter the age: ");
		int eage=sc.nextInt();
		log.info("enter the salary: ");
		double esalary=sc.nextDouble();
		sc.hasNextLine();
		log.info("enter the designation: ");
		String edesign=sc.nextLine();
		log.info("enter the mobile no: ");
		long emobi=sc.nextLong();
		
		Connection con=null;
		PreparedStatement pstmt=null;
		//ResultSet rs=null;
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db?user=root&password=root");
			pstmt=con.prepareStatement("insert into employee values(?,?,?,?,?,?)");
			//pstmt=con.prepareStatement("delete from employee");
			pstmt.setInt(1, eid);
			pstmt.setString(2, ename);
			pstmt.setInt(3, eage);
			pstmt.setDouble(4, esalary);
			pstmt.setString(5, edesign);
			
			pstmt.setLong(6, emobi);
			
			int n=pstmt.executeUpdate();
			if(n>0)
			{
				log.info("updated");
			}
			else {
				log.info("not update");
			}
			
		} catch (Exception e) {
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

		
		
		
	}//end of the main()

}//end of the class
