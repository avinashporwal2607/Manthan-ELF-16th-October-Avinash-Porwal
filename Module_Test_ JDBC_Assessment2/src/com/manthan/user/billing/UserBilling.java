package com.manthan.user.billing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserBilling 
{
	public void userTotalBill()
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");//loading Driver


			// WE CAN OVERLOAD getConnection() by these way also //

			/*	String url="jdbc:mysql://localhost:3306/MusicPlayer";
							String user="root";
							Strig password="root";
							con = DriverManager.getConnection(url, user, password);*/



			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_DB", "root", "root");//Getting connection


			String query = " select sum(Price) as TOTAL_BILL from Hotel_Bill ";//issuing sql query
			pstmt = con.prepareStatement(query);


			rs = pstmt.executeQuery();//executing query
			while(rs.next())

			{
				System.out.println("Total bill of the day is "+rs.getDouble("TOTAL_BILL") );

		
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}//closing rs object
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}//closing pstmt object
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}


		}
	}
	
	public double userSpecificBill(int item_code)
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		double Price=0;
		try {

			Class.forName("com.mysql.jdbc.Driver");//loading Driver


			// WE CAN OVERLOAD getConnection() by these way also //

			/*	String url="jdbc:mysql://localhost:3306/MusicPlayer";
							String user="root";
							Strig password="root";
							con = DriverManager.getConnection(url, user, password);*/



			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_DB", "root", "root");//Getting connection


			String query = " select sum(Price) as generate_bill from Hotel_Bill where Item_Code=? ";//issuing sql query
			pstmt = con.prepareStatement(query);


			rs = pstmt.executeQuery();//executing query
			while(rs.next())

			{
				Price++;
				System.out.println("Customer generate bill is "+rs.getDouble("generate_bill") );

		
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}//closing rs object
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}//closing pstmt object
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}


		}
		return Price;
	}
	
		
}