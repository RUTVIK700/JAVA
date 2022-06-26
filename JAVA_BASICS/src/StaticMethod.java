
public class StaticMethod {

	public static void main(String[] args) {
		System.out.println("inside Main");
		StaticMethod.method1();
	}
	
	static void method1(){
		System.out.println("Inside Method");
	}
	
	static {
		System.out.println("Inside Static Block");
		StaticMethod.method1();
	}
	
}
