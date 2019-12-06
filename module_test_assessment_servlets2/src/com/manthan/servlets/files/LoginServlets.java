package com.manthan.servlets.files;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.bean.dao.UserInfoDao;
import com.manthan.bean.dao.UserInfoDaoImplements;
import com.manthan.dao.manager.UserDaoMgr;
import com.manthan.files.bean.UserInfoBean;
@WebServlet("/login22")
public class LoginServlets extends HttpServlet {
	UserInfoDao dao=UserDaoMgr.getDaoIns();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String email = req.getParameter("email");
		 String password=req.getParameter("password");
		 UserInfoBean u=dao.authenticate(email, password);
		 if(u!=null)
		 {
			 HttpSession session=req.getSession(true);
			 session.setAttribute("u", "user is AUTHENTICATE");
			 
		 }
		 else{

				req.setAttribute("u","user is not AUTHENTICATE ");
			}
			req.getRequestDispatcher("/login").forward(req, resp);
	}

}
