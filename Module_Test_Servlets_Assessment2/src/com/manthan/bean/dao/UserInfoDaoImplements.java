package com.manthan.bean.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.manthan.files.bean.ProductInfoBean;
import com.manthan.files.bean.UserInfoBean;

public class UserInfoDaoImplements implements UserInfoDao{

	@Override
	public UserInfoBean authenticate(String email, String password) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
	

		UserInfoBean u = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Flipkart", "root", "root");

			String query = "select * from User_Info where Email=? and Password=?";
			
			pstmt=con.prepareStatement(query);
			
			pstmt.setString(1,email);
			pstmt.setString(2,password);
			
			rs = pstmt.executeQuery();
			

			if (rs.next()) {
				u= new UserInfoBean();
				
			
			u.setEmail(rs.getString("Email"));
				u.setPassword(rs.getString("Password"));
				

			}
		} // try

		catch (Exception e) {
			e.printStackTrace();
		} // catch

		finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return u;

	}

	

	

	@Override
	public UserInfoBean register(int user_id, String user_name, String email, String password) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// boolean isadded=false;

		UserInfoBean   u = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Flipkart", "root", "root");

			String query = "select * from User_Info ";
			
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, user_id);
			pstmt.setString(2, user_name);
			pstmt.setString(3, email);
			pstmt.setString(4, password);
			
			rs = pstmt.executeQuery();
			

			if (rs.next()) {
				u = new UserInfoBean();
				u.setUser_id(rs.getInt("User_ID"));
				u.setUser_name(rs.getString("User_Name"));
				u.setEmail(rs.getString("Email"));
				u.setPassword(rs.getString("Password"));
				
				

			}
		} // try

		catch (Exception e) {
			e.printStackTrace();
		} // catch

		finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return u;

	}
		
	

	

}
