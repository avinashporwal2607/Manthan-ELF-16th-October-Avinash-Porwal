import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class UserFunctions extends Thread{

	public void searchSong(String Song_Title) {
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


			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MusicPlayer", "root", "root");//Getting Connection


			String query = " select * from MusicFiles where Song_Title=?";//issuing sql query
			pstmt = con.prepareStatement(query);
			pstmt.setString(1,Song_Title );

			rs = pstmt.executeQuery();//executing sql query

			while(rs.next()) {


				System.out.println("Song Found SuccessFully \n");


				System.out.println("Song_Id is- "+rs.getInt("Song_ID"));
				System.out.println("Song Title is- "+rs.getString("Song_Title"));
				System.out.println("Artist Name is- "+rs.getString("Artist_Name"));
				System.out.println("Album Name is- "+rs.getString("Album_Name"));
				System.out.println("Song Location is- "+rs.getString("Song_Location"));
				System.out.println("Description is- "+rs.getString("Description"));
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
	}//End of searchSong


	public void showAllSongs() {
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




			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MusicPlayer", "root", "root");//Getting Connection


			String query = " select * from MusicFiles";//issuing sql query
			stmt = con.createStatement();


			rs = stmt.executeQuery(query);//excuting query
			System.out.println();
			System.out.println("Songs Details Are Here");
			while(rs.next()) {

				System.out.println();
				System.out.print("Song Id is- "+rs.getInt("Song_ID")+"\t");
				System.out.print("Song Title is- "+rs.getString("Song_Title")+"\t");
				System.out.print("Artist Name is- "+rs.getString("Artist_Name")+"\t");
				System.out.print("Album Name is- "+rs.getString("Album_Name")+"\t");
				System.out.print("Song Location is- "+rs.getString("Song_Location")+"\t");
				System.out.print("Description is- "+rs.getString("Description")+"\t");
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
	}//End of showAllSongs





	public String playSong(int Song_ID) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		MusicInformationBean mib=new MusicInformationBean();
		mib=null;

		String Song_Title=null;

		try {

			Class.forName("com.mysql.jdbc.Driver");//loading Driver


			// WE CAN OVERLOAD getConnection() by these way also //

			/*	String url="jdbc:mysql://localhost:3306/MusicPlayer";
							String user="root";
							Strig password="root";
							con = DriverManager.getConnection(url, user, password);*/



			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicplayer", "root", "root");//Getting connection


			String query = " select * from MusicFiles where Song_ID=?";//issuing sql query
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Song_ID);

			rs = pstmt.executeQuery();//executing query

			while(rs.next()) {

				Song_Title=rs.getString("Song_Title");

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
		return Song_Title;
	}//End of playSong


	public void playAllSong() {
		Thread time_lap=new UserFunctions();
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		MusicInformationBean mib=new MusicInformationBean();
		mib=null;

		try {

			Class.forName("com.mysql.jdbc.Driver");//loading Driver


			// WE CAN OVERLOAD getConnection() by these way also //

			/*	String url="jdbc:mysql://localhost:3306/MusicPlayer";
							String user="root";
							Strig password="root";
							con = DriverManager.getConnection(url, user, password);*/



			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MusicPlayer", "root", "root");//Getiing Connection


			String query = " select * from MusicFiles;";//issuing sql query
			stmt = con.createStatement();


			rs = stmt.executeQuery(query);
			while(rs.next()) {				
				System.out.println("Playing now "+rs.getString("Song_Title"));
				time_lap.sleep(1700);

			}
		} catch (Exception e) {
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
	}//End of playAllSongs


	public void playAllSongRandom() {
		Connection con = null;
		Statement stmt1 = null;
		Statement stmt2 = null;
		ResultSet rs1 = null;
		ResultSet rs2 = null;

		Random random=new Random();

		int Count=0;

		try {

			Class.forName("com.mysql.jdbc.Driver");//loading Driver


			// WE CAN OVERLOAD getConnection() by these way also //

			/*	String url="jdbc:mysql://localhost:3306/MusicPlayer";
							String user="root";
							Strig password="root";
							con = DriverManager.getConnection(url, user, password);*/



			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicplayer", "root", "root");//Getting Connection


			String query = " select * from MusicFiles order by rand();";//issuing sql query
			stmt1 = con.createStatement();

			rs1 = stmt1.executeQuery(query);

			while(rs1.next()) {

				Count++;
				System.out.println("Now Playing is"+rs1.getString("Song_Title"));

				System.out.println("..............");


				

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

			if (rs1 != null) {
				try {
					rs1.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}//closing rs1 object
			if (rs2 != null) {
				try {
					rs2.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}//closing rs2 object
			if (stmt1 != null) {
				try {
					stmt1.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}//closing stmt1 object
			if (stmt2 != null) {
				try {
					stmt2.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}//closing stmt2 objcet
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}//closing of con object
		}//End of finally block
	}//End of searchSong

}// End of class

