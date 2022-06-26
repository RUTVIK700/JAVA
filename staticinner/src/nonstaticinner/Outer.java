package nonstaticinner;

public class Outer {
	void f1() {
		System.out.println("Inside Outer Nonstatic method");
	}
	
	class Inner {
		void f2() {
			System.out.println("Inside Inner Nonstatic method");
		}
		
	}
	
	public static void main(String[] args) {
		Outer out=new Outer();
		out.f1();
		Outer.Inner inner=out.new Inner();
		inner.f2();
	}

}
