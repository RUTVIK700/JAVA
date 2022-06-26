package Immutable;

public class Immutable {

	public static void main(String[] args) {
		String s1="hello";
		String s2="bye";
		
		System.out.println("before :"+"\ns1: "+s1+"\ns2: "+s2);
		
		s1=s1.concat(s2);
		
		System.out.println("After :"+"\ns1: "+s1+"\ns2: "+s2);
	}

}
