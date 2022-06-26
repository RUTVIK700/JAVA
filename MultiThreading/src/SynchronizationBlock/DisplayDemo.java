package SynchronizationBlock;

public class DisplayDemo extends Thread {

	public void Sayhello(String name) {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.println("Hello" + name);
			}
		}
	}
}
