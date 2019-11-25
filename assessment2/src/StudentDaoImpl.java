import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDaoImpl implements StudentDao {

	@Override
	public boolean addStudent(StudentInfoBean studentInfoBean) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		boolean isAdded=false;
		try {

			Class.forName("com.mysql.jdbc.Driver");//Loading driver

			String dburl="jdbc:mysql://localhost:3306/user";
			String user="root";
			String pass="root";
			conn=DriverManager.getConnection(dburl,user,pass);//Getting connection

			pstmt=conn.prepareStatement("insert into user values (?,?,?,?)");//issuing sql query

			pstmt.setString(1,studentInfoBean.getUser_name());
			pstmt.setString(2, studentInfoBean.getPassword());
			pstmt.setInt(3,studentInfoBean.getAge());
			pstmt.setString(4,studentInfoBean.getGender());
			int result=pstmt.executeUpdate();//Executing query

			if(result>0) {
				isAdded=true;
			}


		}catch (ClassNotFoundException C) {
			C.printStackTrace();
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return isAdded;
	}





@Override
public StudentInfoBean validate(String username, String password) {
	Connection con=null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	StudentInfoBean studentInfoBean=null;

	try {

		Class.forName("com.mysql.jdbc.Driver");//Loading the driver

		String dburl="jdbc:mysql://localhost:3306/user";
		String user="root";
		String pass="root";
		con = DriverManager.getConnection(dburl, user, pass);//Getting the connection

		
		String query = " select * from student_info where User_name=? and Password=?";//issuing sql query
		pstmt = con.prepareStatement(query);
		pstmt.setString(1, username);
		pstmt.setString(2, pass);

		rs = pstmt.executeQuery();//Executing sql query

		if(rs.next()) {
			studentInfoBean=new StudentInfoBean(); 
			studentInfoBean.setUser_name(rs.getString("User_Name"));
			studentInfoBean.setPassword(rs.getString("Password"));
			studentInfoBean.setAge(rs.getInt("Age"));
			studentInfoBean.setGender(rs.getString("Gender"));

		}
	}
	catch (ClassNotFoundException C) {
	C.printStackTrace();
	}
	catch (Exception e) {
	}//End of outer catch block
	finally {
		
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}//End of finally block
	return studentInfoBean;

}//End of main
}//End of Class

