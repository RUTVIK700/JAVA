
public class SINGLE_INHERITENCE //extends java.lang.object methods
{
	public void m1() {
		System.out.println("INSIDE M1");
	}
	
	public static void main(String[] args) {
		SINGLE_INHERITENCE obj=new SINGLE_INHERITENCE();
		obj.hashCode();//this java.lang.object methods
		obj.getClass();//this java.lang.object methods
		obj.m1();
	}
}
