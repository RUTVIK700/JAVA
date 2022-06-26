
public class Variables_types {
	static String name; //static variable//
	int bank_account;//non-static variable//
	String BankHolder;//non-static variable//
	
	public static void main(String[] args) {
		int IFSC=332323;//local variable
		System.out.println(Variables_types.name);
		Variables_types obj=new Variables_types();
		System.out.println(obj.bank_account);
		
	}
}


