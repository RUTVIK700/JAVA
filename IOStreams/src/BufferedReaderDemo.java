import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		FileReader fr=null;
		BufferedReader br=null;
		int count=0;
		try {
			fr=new FileReader("/Users/rutvi/OneDrive/Desktop/TOmcat , oracle,jdbc.txt");
			br=new BufferedReader(fr);
			String st;
			while((st=br.readLine())!=null) {
				StringTokenizer sr=new StringTokenizer(st);
				while(sr.hasMoreTokens()) {
					System.out.println(sr.nextToken());
					count++;
				}
			}
			System.out.println("This are the number of elements in file "+count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fr.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
