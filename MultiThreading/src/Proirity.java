
public class Proirity extends Thread {

	public static void main(String[] args) {
		Proirity m1=new Proirity();
		m1.setPriority(MAX_PRIORITY);
		m1.setName("M1");
		m1.start();
		
		Proirity m2=new Proirity();
		m2.setPriority(MIN_PRIORITY);
		m2.setName("M2");
		m2.start();
	}
	
	public void run() {
		Thread currentThread= Thread.currentThread();
		System.out.println("hello "+currentThread.getName());
	}

}
