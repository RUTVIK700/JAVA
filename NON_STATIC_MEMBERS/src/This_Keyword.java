
public class This_Keyword {
	int a;
	This_Keyword(){
		System.out.println(this.a);
		System.out.println(this);
	}
	public static void main(String[] args) {
		new This_Keyword();
	}
}
