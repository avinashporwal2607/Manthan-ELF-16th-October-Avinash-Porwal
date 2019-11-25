import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class OpeationOnDataBase {

	public void addSong() {
		Connection con = null;
		PreparedStatement pstmt = null;


		Scanner sc=new Scanner(System.in);

		System.out.println("Please Enter Song_ID: ");
		int Song_ID=sc.nextInt();
		sc.nextLine();
		System.out.println("Please Enter Song_Title: ");
		String Song_Title=sc.nextLine();
		System.out.println("Please Enter Artist_Name: ");
		String Artist_Name=sc.nextLine();
		System.out.println("Please Enter Album_Name: ");
		String Album_Name=sc.nextLine();
		System.out.println("Please Enter Song_Location: ");
		String Song_Location=sc.nextLine();
		System.out.println("Please Enter Song_Description: ");
		String Description=sc.nextLine();




		try {
			
			Class.forName("com.mysql.jdbc.Driver");//loading Driver
			
			//WE CAN OVERLOAD getConnection() by these way also
			
		/*	String url="jdbc:mysql://localhost:3306/MusicPlayer";
			String user="root";
			Strig password="root";
			con = DriverManager.getConnection(url, user, password);*/
			
			
			
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MusicPlayer", "root", "root");//Getting Connection

			
			String query = " insert into MusicFiles values (?,?,?,?,?,?)";//sql issuing query
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Song_ID);
			pstmt.setString(2, Song_Title );
			pstmt.setString(3, Artist_Name);
			pstmt.setString(4, Album_Name);
			pstmt.setString(5, Song_Location);
			pstmt.setString(6, Description);


			int n = pstmt.executeUpdate();//executing query
			if(n>0) {

				System.out.println(" Song Added Successfully in DataBase" );

			}
			else
			{
				System.err.println(" Oops! Sorry,Song NOT Added Successfully in DataBase" );
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
	}//End of AddSong
	
	public void updateSong() {
		Connection con = null;
		PreparedStatement pstmt = null;
		//ResultSet rs = null;

		Scanner sc=new Scanner(System.in);

		System.out.println("Please Enter Song_ID- ");
		int Song_ID=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Please Enter the value of Song_Title Column- ");
		String Column_Value=sc.nextLine();




		try {
			
			Class.forName("com.mysql.jdbc.Driver");//Loading Driver
			
			
			
			//WE CAN OVERLOAD getConnection() by these way also
			
			/*	String url="jdbc:mysql://localhost:3306/MusicPlayer";
				String user="root";
				Strig password="root";
				con = DriverManager.getConnection(url, user, password);*/
				

			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicplayer", "root", "root");//Getting Connection

			
			String query = " update MusicFiles set  Song_Title=? where Song_ID=? ";//sql issuing query
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, Column_Value );
			pstmt.setInt(2, Song_ID);


			int result = pstmt.executeUpdate();//executing query
			if(result>0) {

				System.out.println("Song Updated Successfully in DataBase");

			}
			else
			{
				System.out.println("Oops ! Sorry ,Song NOT Updated Successfully in DataBase");
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
	}//End of updateSong

	public void deleteSong() {
		Connection con = null;
		PreparedStatement pstmt = null;
		//ResultSet rs = null;

		Scanner sc=new Scanner(System.in);

		System.out.println("Please Enter Song_ID: ");
		int Song_ID=sc.nextInt();
		sc.nextLine();


		try {
			
			Class.forName("com.mysql.jdbc.Driver");//Loading Driver
			
			
			
			//WE CAN OVERLOAD getConnection() by these way also
			
			/*	String url="jdbc:mysql://localhost:3306/MusicPlayer";
				String user="root";
				String password="root";
				con = DriverManager.getConnection(url, user, password);*/
				

			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MusicPlayer", "root", "root");//Getting connection

			
			String query = "delete from MusicFiles where Song_Id=?";//sql query issuing
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Song_ID);


			int result = pstmt.executeUpdate();//executing query
			if(result>0) {

				System.out.println("Song Deleted Successfully from DataBase");

			}
			else
			{
				System.err.println("Oops! Sorry, Song NOT Deleted Successfully from DataBase");
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
	}//End of deleteSong

}//End of Class

