
public class Primitive_to_Object {
	public static void main(String[] args) {
		int a=100;
		Integer y=Integer.valueOf(a);//primitive to object  Boxing
		System.out.println(y);
		int z=y.intValue();// object to Primitive unboxing
		System.out.println(z);
				
	}
}
