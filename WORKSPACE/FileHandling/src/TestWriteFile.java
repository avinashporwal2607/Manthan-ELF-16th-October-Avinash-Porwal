import java.io.FileOutputStream;
import java.io.IOException;

public class TestWriteFile {
	public static void main(String[] args) {
		String msg="hii how r you ?";
		byte [] b=msg.getBytes();
		try(FileOutputStream fout=new FileOutputStream("qspiders.txt");)
		{
			//FileOutputStream fout=new FileOutputStream("porwal.txt");//WE CAN GIVE path here like D:filename.txt
			//fout.close();
			fout.write(b);
			System.out.println("written done");
		}
		catch(IOException E)
		{
			E.printStackTrace();
		}
	}

}
