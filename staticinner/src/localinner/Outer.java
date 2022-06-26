package localinner;

public class Outer {
	void f1() {
		System.out.println("Inside Outer f1()");
		class Inner{
			void f2() {
				System.out.println("inside local inner f2()");
			}
		}
		Inner inner=new Inner();
		inner.f2();
	}
	public static void main(String[] args) {
		Outer out=new Outer();
		out.f1();
	}

}
