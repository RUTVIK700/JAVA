
public class ReverseArray {

	public static void main(String[] args) {
		char arr[]=new char[5];
		String r="Hello";
		int c=0;
		for(int i=r.length()-1;i>=0;i--) {
			arr[c]=r.charAt(i);
			c++;
		}
		System.out.println(arr);
		
	}

}
