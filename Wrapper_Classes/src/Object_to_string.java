
public class Object_to_string {

	public static void main(String[] args) {
		long a=1000000;//Create long
		Long b=Long.valueOf(a);//create object from long primitive
		String c=Long.toString(b);//create string from object Long
		Long d=Long.valueOf(c);//create object from string
	}

}
