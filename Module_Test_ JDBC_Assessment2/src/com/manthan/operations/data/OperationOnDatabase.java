package com.manthan.operations.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Logger;

public class OperationOnDatabase {
	public void removeFood() {
		Connection con = null;
		PreparedStatement pstmt = null;
		//ResultSet rs = null;

		Scanner sc=new Scanner(System.in);
		Logger log=Logger.getLogger("mylOGGER");

		log.info("Please Enter Item code: ");
		int item_code=sc.nextInt();
		sc.nextLine();


		try {

			Class.forName("com.mysql.jdbc.Driver");//Loading Driver



			//WE CAN OVERLOAD getConnection() by these way also

			/*	String url="jdbc:mysql://localhost:3306/MusicPlayer";
			String user="root";
			String password="root";
			con = DriverManager.getConnection(url, user, password);*/



			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_DB", "root", "root");//Getting connection


			String query = "delete from Hotel_Bill where  Item_Code=?";//sql query issuing
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, item_code);


			int result = pstmt.executeUpdate();//executing query
			if(result>0) {

				log.info("Food item remove Successfully from DataBase");

			}
			else
			{
				log.info("Oops! Sorry, Food item NOT remove Successfully from DataBase");
			}
		}
		catch (ClassNotFoundException c)
		{
			c.printStackTrace();
		}

		catch (Exception e) {
			e.printStackTrace();
		}//End of Outer catch block
		finally {


			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}//Close pstmt object
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}//close con object
		}//End of finally block
	}//End of removeFood


	public void modifyFood() {
		Connection con = null;
		PreparedStatement pstmt = null;
		//ResultSet rs = null;

		Scanner sc=new Scanner(System.in);
		Logger log=Logger.getLogger("mylOGGER");

		log.info("Please Enter item code ");
		int item_code=sc.nextInt();
		sc.nextLine();

		log.info("Please Enter the value of food name Column- ");
		String Column_Value=sc.nextLine();




		try {

			Class.forName("com.mysql.jdbc.Driver");//Loading Driver



			//WE CAN OVERLOAD getConnection() by these way also

			/*	String url="jdbc:mysql://localhost:3306/MusicPlayer";
			String user="root";
			Strig password="root";
			con = DriverManager.getConnection(url, user, password);*/



			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_DB", "root", "root");//Getting Connection


			String query = " update Hotel_Bill set  Food_Name=? where Item_Code=? ";//sql issuing query
			pstmt = con.prepareStatement(query);

			pstmt.setString(1, Column_Value );
			pstmt.setInt(2, item_code);


			int result = pstmt.executeUpdate();//executing query
			if(result>0) {

				log.info("Food Name Updated Successfully in DataBase");

			}
			else
			{
				log.info("Oops ! Sorry ,Food Name NOT Updated Successfully in DataBase");
			}

		}
		catch (ClassNotFoundException c)
		{
			c.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}//End of outer catch block
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
	}//End of modifyFood()


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


}//End of Class

