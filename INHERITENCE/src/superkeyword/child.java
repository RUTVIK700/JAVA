package superkeyword;

public class child extends parent{
	int a;
	int b;
	child(int c,int d,int a,int b) {
		super(c,d); //always write super at the starting//
		this.a=a;
		this.b=b;
	}
	public static void main(String[] args) {
		child v=new child(10,20,30,40);
	}
}
