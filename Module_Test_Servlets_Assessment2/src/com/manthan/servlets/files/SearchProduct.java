package com.manthan.servlets.files;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.bean.dao.ProductDao;
import com.manthan.bean.dao.ProductInfoDaoImplements;
import com.manthan.dao.manager.ProductDaoMgr;
import com.manthan.files.bean.ProductInfoBean;
@WebServlet("/searchproduct")
public class SearchProduct extends HttpServlet{
	//ProductDao dao=ProductDaoMgr.getDaoIns();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session=req.getSession(false);
		if(session!=null)
		{
			int pid=Integer.parseInt(req.getParameter("product_id"));
			ProductDao dao=new ProductInfoDaoImplements();
			ProductInfoBean p=dao.searchProduct(pid);


			if(p!=null)
			{
				req.setAttribute("searchproduct", p);

			}
			else
			{
				req.setAttribute("msg", "product not found");
			}
			req.getRequestDispatcher("/searchproduct").forward(req, resp);

		}
		else {
			req.setAttribute("msg", "invalid details login first");
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
		}
	}





}



