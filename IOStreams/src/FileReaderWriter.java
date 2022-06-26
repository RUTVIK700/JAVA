import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	public static void main(String[] args) throws IOException {
		FileReader fr=null;
		FileWriter fw=null;
		
		fr=new FileReader("/Users/rutvi/OneDrive/Desktop/TOmcat , oracle,jdbc.txt");
		fw=new FileWriter("/Users/rutvi/OneDrive/Desktop/newjavademo.txt");
		int data;
		while((data=fr.read())!=-1) {
			System.out.print((char)data);
			fw.write(data);
		}
		fr.close();
		fw.close();
	}

}
