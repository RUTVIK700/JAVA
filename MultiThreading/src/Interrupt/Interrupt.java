package Interrupt;

public class Interrupt extends Thread {
	@Override
	public void run() {
			try {
			for(int i=0;i<10;i++) {
					System.out.println("I'm happy");
					Thread.sleep(1000);
			} 
			}
			catch (InterruptedException e) {
				System.out.println("Interrupted");
			}
		}
	}

