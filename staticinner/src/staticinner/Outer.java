package staticinner;

public class Outer {
	static void f1() {
		System.out.println("Inside OUTER static method");
	}

	static class Inner {
		static void f() {
			System.out.println("Inside Inner static method");
		}
		void f1() {
			System.out.println("Inside the Inner Nonstatic method");
		}
		
	}

	public static void main(String[] args) {
		Outer f=new Outer();
		f.f1();
		Outer.Inner.f();
		Outer.Inner obj=new Outer.Inner();
		obj.f1();
	}
}
