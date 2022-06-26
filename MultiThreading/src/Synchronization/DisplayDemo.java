package Synchronization;

public class  DisplayDemo extends Thread {

	public synchronized void Sayhello(String name) {
		for(int i=0;i<10;i++) {
			System.out.println("Hello"+name);
		}
	}
}
