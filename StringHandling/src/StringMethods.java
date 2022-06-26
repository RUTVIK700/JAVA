
public class StringMethods {

	public static void main(String[] args) {
		String s1="adadasda HELLO";
		System.out.println(s1.length());
		
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.charAt(3));
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(4, 6));
		
		String[] split = s1.split(" ");
		for (int i=0; i<split.length;i++) {
			System.out.println(split[i]);	
		}
		
		
		System.out.println(s1.replace('a','h'));
		char[] charArray = s1.toCharArray();
		for (int i=0; i<charArray.length;i++) {
			System.out.println(charArray[i]);
		}
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
	}

}
