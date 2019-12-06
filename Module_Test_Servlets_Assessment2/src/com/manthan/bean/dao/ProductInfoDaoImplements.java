package com.manthan.bean.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.manthan.files.bean.ProductInfoBean;

public class ProductInfoDaoImplements implements ProductDao{

	@Override
	public ProductInfoBean searchProduct(int product_id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		

		ProductInfoBean  p = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Flipkart", "root", "root");

			String query = "select * from Product_Info where Product_ID=?";
			
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, product_id);
			rs = pstmt.executeQuery();
			

			if (rs.next()) {
				p = new ProductInfoBean();
				p.setProduct_id(rs.getInt("Product_ID"));
				p.setProduct_name(rs.getString("Product_Name"));
				p.setProduct_color(rs.getString("Product_Color"));
				p.setProduct_cost(rs.getDouble("Product_Cost"));
				
				p.setDescription(rs.getString("Description"));
				p.setNumber_of_product(rs.getInt("Number_of_product"));
				
				

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
		return p;

	}
	}
	


