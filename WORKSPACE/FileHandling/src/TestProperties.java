import java.io.FileOutputStream;
import java.util.Properties;

public class TestProperties {
	public static void main(String[] args) {
		Properties pr=new Properties();
		pr.setProperty("driverName","com.mysql.jdbcDriver");
		pr.setProperty("url", "jdbc:mysql://localhost:3306");
		pr.setProperty("user", "root");
		pr.setProperty("password", "root");
		
		try {
			FileOutputStream fout=new FileOutputStream("mydatabase.properties");
			pr.store(fout, "storedata here ");//for write the data use store// only text data can use here
			System.out.println("done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
