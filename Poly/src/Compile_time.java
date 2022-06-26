
public class Compile_time {
	void add(int a,int b) {
		int c= a+b;
		System.out.println(c);
	}
	
	void add(float a,float b,float c) {
		float d=a+b+c;
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		Compile_time o=new Compile_time();
		o.add(20, 30);
		o.add(32.4f, 39.01f, 55.51f);
	}

}
