
public class Non_Static_Methods_Variables_Constructor_Blocks {
	int a;
	Non_Static_Methods_Variables_Constructor_Blocks(){
		System.out.println("inside Constructer");
	}
	
	{
		System.out.println("Inside Nonstatic Blocks");
	}
	
	public static void main(String[] args) {
		System.out.println("Inside the main methood");
		new Non_Static_Methods_Variables_Constructor_Blocks();
		//Non_Static_Methods_Variables_Constructor_Blocks obj=new Non_Static_Methods_Variables_Constructor_Blocks();
		//obj.init();
	}
	
	static {
		System.out.println("inside static block");
	}
	
	void init() {
		System.out.println("hello");
	}
	
}
