import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestReadData {
	public static void main(String[] args) {
		try {
			FileInputStream fin=new FileInputStream("qspiders.txt");
			int m;
			while((m=fin.read())!=-1)//-1 indicate for end of contnet of file
			{
				System.out.print((char)m);
			}
				
		}catch (FileNotFoundException e) {
		e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
