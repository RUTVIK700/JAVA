package daemon;

public class DaemonDemo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon());
		MyThread t1=new MyThread();
		t1.setDaemon(true);
		System.out.println(t1.isDaemon());
		t1.start();
	}
}
