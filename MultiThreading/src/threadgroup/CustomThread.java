package threadgroup;

public class CustomThread extends Thread {
	
	CustomThread(ThreadGroup g, String v){
		super(g,v);
	}
	@Override
	public void run() {
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
