package deadlock;

public class FirstResource {
	public synchronized void method1(SecondResoure sr) {
		System.out.println("Inside First method2 of FR");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("invoking second resource");
		sr.method2();
		
	}
	
	public synchronized void  method2() {
		System.out.println("INside method 2 of FR" );
	}
}
