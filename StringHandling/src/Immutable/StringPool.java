package Immutable;

public class StringPool {

	public static void main(String[] args) {
		Product product1= new Product(1,"abc");
		Product product2= new Product(1,"abc");
		
		String s1="ggg";
		String s2="ggg";
		String s3="kkk";
		String s4=new String("ggg"); // Here the new keyword assign the new location to the the S4 therefore it return false 
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1==s2); // it compares the memory location of the String only not the content of Strings
		System.out.println(s1.equals(s2)); //it  compares the contents of the String
		
		System.out.println(s1==s4); // it compares the memory location of the String
		System.out.println(s1.equals(s4)); //it  compares the contents of the String
		
		System.out.println(product1==product2); // it compares the memory location of the Objects
		System.out.println(product1.equals(product2)); //it  compares the memory location of the Objects (We can override it to compare if two objects are same or not)
		
	}

}
