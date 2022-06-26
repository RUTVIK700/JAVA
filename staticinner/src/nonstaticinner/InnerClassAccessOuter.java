package nonstaticinner;

public class InnerClassAccessOuter {
	private static int x=50;
	private int y;
	InnerClassAccessOuter(int y){
		this.y=y;
	}
	void f() {
		System.out.println("Inside Outer method f");
	}
	class Inner{
		private int y;
		Inner(int y){
			this.y=y;
		}
		
		private void f() {
			System.out.println("Inside Inner Method f");
			System.out.println("Outer Class x= "+InnerClassAccessOuter.x); // it is static variable 
			System.out.println("Outer Class y= "+InnerClassAccessOuter.this.y);//it is a nonstatic variable
			System.out.println("inner Class y= "+this.y);
		}
	}
	public static void main(String[] args) {
		InnerClassAccessOuter out=new InnerClassAccessOuter(40);
		out.f();
		InnerClassAccessOuter.Inner inner=out.new Inner(30);
		inner.f();
	}

}
