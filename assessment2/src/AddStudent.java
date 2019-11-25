

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/addStudentJsp")
public class AddStudent extends HttpServlet {



	private StudentDao dao=new StudentDaoImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//HttpSession session=req.getSession(false);
		//if(session!=null){
		//EmployeeInfoBeans beans=(EmployeeInfoBeans) req.getAttribute("employeeInfoBean");

		//get the form data
		String uname=req.getParameter("User_Name");
		String pword=req.getParameter("Password");
		int age=Integer.parseInt(req.getParameter("Age"));
		String gender=req.getParameter("Gender");


		StudentInfoBean s=new StudentInfoBean();
		s.setUser_name(uname);
		s.setPassword(pword);
		s.setAge(age);
		s.setGender(gender);




		if(dao.addStudent(s)) {
			req.setAttribute("addedMsg", "USER Added Please login to continue..");
			req.getRequestDispatcher("./loginForm").forward(req, resp);
		}else {
			req.setAttribute("addedMsg", "USER is alreay there please enter the other name");
			req.getRequestDispatcher("./addStudent").forward(req, resp);
		}

	}

}

