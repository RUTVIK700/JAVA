import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			fis=new FileInputStream("/Users/rutvi/OneDrive/Pictures/sharmila.JPG");
			fos=new FileOutputStream("/Users/rutvi/OneDrive/Pictures/new.JPG");
			int data;
			while((data=fis.read())!=-1) {
				fos.write(data);
				System.out.println("File got written");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
