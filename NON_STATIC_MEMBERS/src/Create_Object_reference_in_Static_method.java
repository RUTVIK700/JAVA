
public class Create_Object_reference_in_Static_method {
	static Create_Object_reference_in_Static_method obj;
	static {
		System.out.println(Create_Object_reference_in_Static_method.obj);
		Create_Object_reference_in_Static_method.obj=Create_Object_reference_in_Static_method.init();
	}
	
	public static void main(String[] args) {
		System.out.println(Create_Object_reference_in_Static_method.obj);
		
	}
	
	static Create_Object_reference_in_Static_method init(){
		return new Create_Object_reference_in_Static_method();
	}
}
