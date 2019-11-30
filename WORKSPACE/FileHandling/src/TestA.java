import java.io.File;
import java.io.IOException;

public class TestA {
	public static void main(String[] args) {
		File f=new File("avi.txt");
		try
		{
			f.createNewFile();
			System.out.println("done");
		}catch (IOException e) {
	System.out.println("cant create now");
		}
	}

}
