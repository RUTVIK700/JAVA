package Synchronization;


public class MyThread extends Thread {
	DisplayDemo dm;
	String name;
	public MyThread(DisplayDemo dm,String name) {
		this.dm=dm;
		this.name=name;
	}
	public void run() {
		dm.Sayhello(name);
	}

}
