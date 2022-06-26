
public class StringDemo {


	public static void main(String[] args) {
		//Ways to create String in java*/
		String s1="Rutvik";
		
		String s2=new String("heloo");
		
		char c[]= {'a','e','i','o'};
		String s3=new String(c);
		
		byte b[]= {63,74,12};
		String s4=new String (b);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		int y=12;
		System.out.println(((Object) y).getClass().getName());
		if(Integer.class.isInstance(b)) {   // check if a variable belongs to which type
			System.out.println("hell");
		}
	}

}
