import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		try {
			System.out.println("Enter here ");
			Scanner obj=new Scanner(System.in);
			int a,b,v;
			a=Integer.parseInt(obj.next());
			b=obj.nextInt();
			v=a/b;
			System.out.println("Result "+v);
		} catch (ArithmeticException e) {
			System.out.println("no");
		}
	}
}
