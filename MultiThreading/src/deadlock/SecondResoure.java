package deadlock;

public class SecondResoure {
	public synchronized void method1(FirstResource fr) {
		System.out.println("Inside First method1 of SR");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("invoking first resource");
		fr.method2();
	}
	
	public synchronized void  method2() {
		System.out.println("INside method 2 of SR");
	}
}
