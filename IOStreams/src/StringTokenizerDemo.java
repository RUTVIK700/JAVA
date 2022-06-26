import java.util.StringTokenizer;
public class StringTokenizerDemo {

	public static void main(String[] args) {
		String r="I will do it";
		StringTokenizer st= new StringTokenizer(r);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
