import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
	public static void main(String[] args) {
		String msg="good eve, how are you ?";
		char[] c=msg.toCharArray();
		try
		{
			FileWriter fw=new 	FileWriter("divya.txt");//to write txt data only
			fw.write(c);
			fw.flush();//for write the data into file use this flush or otherwise close the file
			//fw.close();
			System.out.println("done");
		}catch (IOException e) {
			// TODO: handle exception
		}
	}

}
