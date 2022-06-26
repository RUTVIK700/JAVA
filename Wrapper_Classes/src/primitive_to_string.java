
public class primitive_to_string {

	public static void main(String[] args) {
		byte a=100;
		String b=Byte.toString(a);//primitive to string
		byte c=Byte.parseByte(b);//string to primitive
		System.out.println(c);
	}

}
