import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestFileProperties {
	public static void main(String[] args) {
		try {
			FileInputStream fin=new FileInputStream("mydatabase.properties");
			Properties pr=new Properties();
			pr.load(fin);//it is for getting the data from the file
			String user=pr.getProperty("user");
			String url=pr.getProperty("url");
			System.out.println("user is"+user);
			System.out.println("url is"+url);
			
		} catch ( IOException e) {
			e.printStackTrace();
		}
	}

}
