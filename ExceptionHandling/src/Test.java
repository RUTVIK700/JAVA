
public class Test {
	static ArrayOutBound a;
	public static void main(String[] args) {
		try {
			Test.a.method();
		} catch (NullPointerException e) {
			System.out.println("null");
		}
	}

}
