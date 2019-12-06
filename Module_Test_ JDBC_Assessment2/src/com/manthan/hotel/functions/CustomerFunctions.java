package com.manthan.hotel.functions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Logger;

import com.manthan.bean.hotelinfo.HotelInfoBean;

public class CustomerFunctions {
	public void addFood() {
		Connection con = null;
		PreparedStatement pstmt = null;


		Scanner sc=new Scanner(System.in);
		Logger log=Logger.getLogger("mylOGGER");


		log.info("Please Enter item code ");
		int item_code=sc.nextInt();
		sc.nextLine();
		log.info("Please Enter Food name ");
		String food_name=sc.nextLine();
		log.info("Please Enter price ");
		double price=sc.nextDouble();




		try {

			Class.forName("com.mysql.jdbc.Driver");//loading Driver

			//WE CAN OVERLOAD getConnection() by these way also

			/*	String url="jdbc:mysql://localhost:3306/MusicPlayer";
	String user="root";
	Strig password="root";
	con = DriverManager.getConnection(url, user, password);*/




			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_DB", "root", "root");//Getting Connection


			String query = " insert into Hotel_Bill values (?,?,?)";//sql issuing query
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, item_code);
			pstmt.setString(2, food_name);
			pstmt.setDouble(3,price);


			int n = pstmt.executeUpdate();//executing query
			if(n>0) {

				log.info(" Food item Added Successfully in DataBase" );

			}
			else
			{
				log.info(" Oops! Sorry,Food item NOT Added Successfully in DataBase" );
			}

		}
		catch (ClassNotFoundException c)
		{
			c.printStackTrace();
		}

		catch (Exception e) {
			e.printStackTrace();
		}//end of outer catch block
		finally {


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
			}//closing con object
		}//End of finally block
	}//End of addFood


public void showAllFood() {
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;

	try {

		Class.forName("com.mysql.jdbc.Driver");//loading Driver

		// WE CAN OVERLOAD getConnection() by these way also //

		/*	String url="jdbc:mysql://localhost:3306/MusicPlayer";
						String user="root";
						Strig password="root";
						con = DriverManager.getConnection(url, user, password);*/




		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_DB", "root", "root");//Getting Connection


		String query = " select * from Hotel_Bill";//issuing sql query
		stmt = con.createStatement();


		rs = stmt.executeQuery(query);//excuting query
		System.out.println();
		System.out.println("Food Details Are Here");
		while(rs.next()) {

			System.out.println();
			System.out.print("Item code is- "+rs.getInt("Item_Code")+"\t");
			System.out.print("Food name is- "+rs.getString("Food_Name")+"\t");
			System.out.print("Price is- "+rs.getDouble("Price")+"\t");
			System.out.println();

		}
	} 
	catch (ClassNotFoundException c)
	{
		c.printStackTrace();
	}
	catch (Exception e) {
		e.printStackTrace();
	}//close outer catch block
	finally {

		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//close rs object
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//close stmt object
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//close con object
	}//End of finally block
}//End of showAllFood

public double orderCustomer(int item_code) {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	HotelInfoBean hif=new HotelInfoBean();
	hif=null;
	

	double Price=0;

	try {

		Class.forName("com.mysql.jdbc.Driver");//loading Driver


		// WE CAN OVERLOAD getConnection() by these way also //

		/*	String url="jdbc:mysql://localhost:3306/MusicPlayer";
						String user="root";
						Strig password="root";
						con = DriverManager.getConnection(url, user, password);*/



		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_DB", "root", "root");//Getting connection


		String query = " select sum(Price) from Hotel_Bill where Item_Code=?";//issuing sql query
		pstmt = con.prepareStatement(query);
		pstmt.setInt(1, item_code);

		rs = pstmt.executeQuery();//executing query

		while(rs.next()) {

			
			
			System.out.println("customer order bill is"+rs.getDouble("Price"));
			Price ++;

		}
	} catch (Exception e) {
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
	}//End of finally block
	return Price;
}//End of playSong

}//end of class
