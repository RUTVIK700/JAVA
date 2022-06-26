
public class Create_Static_refrence_diectly {
	static Create_Static_refrence_diectly obj;
	
	static {
		System.out.println(Create_Static_refrence_diectly.obj);
		Create_Static_refrence_diectly.obj=new Create_Static_refrence_diectly();
	}
	
	public static void main(String[] args) {
		System.out.println(Create_Static_refrence_diectly.obj);
	}
}
