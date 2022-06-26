
public class MultiThreading extends Thread {

	public static void main(String[] args) throws InterruptedException {
		MultiThreading f = new MultiThreading();
		f.start();
		for (int i = 0; i < 200; i++) {
			System.out.print("i: " + i + "\t");
			Thread.sleep(1000);
		}
	}

	public void run() {
		for (int j = 0; j < 200; j++) {
			System.out.print("j: " + j + "\t");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
